import org.gradle.plugins.ide.idea.model.IdeaLanguageLevel
import org.jetbrains.gradle.ext.runConfigurations
import org.jetbrains.gradle.ext.settings
import org.jetbrains.gradle.ext.Gradle

plugins {
    id("org.jetbrains.gradle.plugin.idea-ext") version "1.1.10"
    id("io.freefair.lombok") version "8.13" apply false
    `java-library`
}

allprojects {
    apply(plugin = "org.jetbrains.gradle.plugin.idea-ext")

    idea {
        module {
            excludeDirs = setOf(
                file(".github"), file(".gradle"), file(".idea"), file("build"), file("gradle"), file("run")
            )
        }
    }
}

subprojects {
    apply(plugin = "io.freefair.lombok")
    apply(plugin = "java-library")

    group = "dev.redstudio"
    version = "0.7-Dev-1" // Versioning must follow Ragnarök versioning convention: https://github.com/Red-Studio-Ragnarok/Commons/blob/main/Ragnar%C3%B6k%20Versioning%20Convention.md

    repositories {
        mavenCentral()
    }

    dependencies {
        annotationProcessor("net.java.dev.jna:jna-platform:5.13.0")

        compileOnly("com.pkware.jabel:jabel-javac-plugin:1.0.1-1") { isTransitive = false }

        testAnnotationProcessor("com.pkware.jabel:jabel-javac-plugin:1.0.1-1")
        testCompileOnly("com.pkware.jabel:jabel-javac-plugin:1.0.1-1") { isTransitive = false }
    }

    // Set the toolchain version to decouple the Java we run Gradle with from the Java used to compile and run the mod
    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(8))
            vendor.set(JvmVendorSpec.ADOPTIUM)
        }
        withSourcesJar() // Generate sources jar
    }

    tasks {
        withType<JavaCompile> {
            options.encoding = "UTF-8"
            options.compilerArgs.add("-Xlint:-options")

            options.isFork = true
            options.forkOptions.jvmArgs = listOf("-XX:+UseStringDeduplication")

            if (name != "compileMcLauncherJava" && name != "compilePatchedMcJava" && name != "generateEffectiveLombokConfig") {
                sourceCompatibility = "21"
                options.release = 8
                options.compilerArgs.add("--release=8")
                javaCompiler.set(project.javaToolchains.compilerFor {
                    languageVersion.set(JavaLanguageVersion.of(21))
                })
            }
        }

        // Define embedded dependencies configuration
        val implementation by configurations.getting
        val embed = configurations.register("embed") {
            description = "Embedded dependencies"
            isTransitive = true
            implementation.extendsFrom(this)
        }

        // Include embedded dependencies into the jar
        named<Jar>("jar") {
            duplicatesStrategy = DuplicatesStrategy.EXCLUDE

            dependsOn(embed)
            from(embed.map { config ->
                config.map {
                    if (it.isDirectory) it else zipTree(it)
                }
            })
        }
    }
}

idea {
    project {
        settings {
            jdkName = "21"
            languageLevel = IdeaLanguageLevel("JDK_21")

            runConfigurations {
                listOf("Client", "Server", "Obfuscated Client", "Obfuscated Server", "Vanilla Client", "Vanilla Server").forEach { name ->
                    register(name, Gradle::class.java) {
                        val prefix = name.substringBefore(" ").let { if (it == "Obfuscated") "Obf" else it }
                        val suffix = name.substringAfter(" ").takeIf { it != prefix } ?: ""
                        taskNames = setOf("run$prefix$suffix")

                        jvmArgs = "-XX:+UseStringDeduplication"
                    }
                }
            }
        }
    }
}
