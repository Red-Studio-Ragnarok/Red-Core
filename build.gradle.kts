import org.jetbrains.gradle.ext.settings
import org.gradle.plugins.ide.idea.model.IdeaLanguageLevel
import org.jetbrains.gradle.ext.Gradle
import org.jetbrains.gradle.ext.runConfigurations

plugins {
    id("org.jetbrains.kotlin.jvm") version embeddedKotlinVersion
    id("org.jetbrains.gradle.plugin.idea-ext") version "1.1.8"
    id("io.freefair.lombok") version "8.6"
    id("maven-publish")
    id("java-library")
}

allprojects {
    apply(plugin = "org.jetbrains.gradle.plugin.idea-ext")
    apply(plugin = "io.freefair.lombok")
    apply(plugin = "java-library")
    apply(plugin = "maven-publish")

    group = "dev.redstudio"
    version = "0.6-Dev-3" // Versioning must follow Ragnarök versioning convention: https://github.com/Red-Studio-Ragnarok/Commons/blob/main/Ragnar%C3%B6k%20Versioning%20Convention.md

    repositories {
        gradlePluginPortal()
    }

    idea {
        module {
            excludeDirs = setOf(
                file(".github"), file(".gradle"), file(".idea"), file("build"), file("gradle"), file("run")
            )
        }
    }

    // Set the toolchain version to decouple the Java we run Gradle with from the Java used to compile and run the mod
    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(8))
            vendor.set(JvmVendorSpec.ADOPTIUM)
        }
        // Generate sources jar when building
        withSourcesJar()
    }

    tasks.withType<JavaCompile>().configureEach {
        options.encoding = "UTF-8"
        options.isFork = true
        options.forkOptions.jvmArgs = listOf("-Xmx4G")
    }

    // Define embedded dependencies configuration
    val embed = configurations.create("embed") {
        description = "Embedded dependencies"
        isTransitive = true
    }
    configurations.named("implementation").configure {
        extendsFrom(embed)
    }

    // Include embedded dependencies into the jar
    tasks.named<Jar>("jar").configure {
        dependsOn(configurations.getByName("embed"))
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
        from({
            configurations.getByName("embed").map { if (it.isDirectory) it else zipTree(it) }
        })
    }
}

idea {
    project {
        settings {
            jdkName = "1.8"
            languageLevel = IdeaLanguageLevel("JDK_1_8")

            runConfigurations {
                create("MC 1.8-1.12 Client", Gradle::class.java) {
                    taskNames = setOf("runClient")
                }
                create("MC 1.8-1.12 Server", Gradle::class.java) {
                    taskNames = setOf("runServer")
                }
                create("MC 1.8-1.12 Obfuscated Client", Gradle::class.java) {
                    taskNames = setOf("runObfClient")
                }
                create("MC 1.8-1.12 Obfuscated Server", Gradle::class.java) {
                    taskNames = setOf("runObfServer")
                }
                create("MC 1.8-1.12 Vanilla Client", Gradle::class.java) {
                    taskNames = setOf("runVanillaClient")
                }
                create("MC 1.8-1.12 Vanilla Server", Gradle::class.java) {
                    taskNames = setOf("runVanillaServer")
                }
            }
        }
    }
}
