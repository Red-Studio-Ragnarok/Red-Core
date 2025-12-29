plugins {
    id("com.gtnewhorizons.retrofuturagradle") version "2.0.2"
}

val id = "redcore"
val plugin = "${project.group}.${id}.asm.RedCorePlugin"

val jvmCommonArgs = "-Dfile.encoding=UTF-8 -XX:+UseStringDeduplication"

val jarBaseName = "!Red-Core-MC-1.8-1.12"

val jafamaVersion = "2.3.2"

minecraft {
    mcVersion = "1.12.2"
    username = "Desoroxxx"
    extraRunJvmArguments = listOf("-Dforge.logging.console.level=debug", "-Dfml.coreMods.load=${plugin}") + jvmCommonArgs.split(" ")
}

dependencies {
    patchedMinecraft("me.eigenraven.java8unsupported:java-8-unsupported-shim:1.0.0")

    embed(project(":core"))
    embed(project(":mc:common"))

    implementation("net.jafama", "jafama", jafamaVersion)
}

idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
        inheritOutputDirs = true
    }
}

tasks {
    processResources {
        val expandProperties = mapOf(
            "version" to project.version,
            "name" to rootProject.name,
            "id" to id
        )

        inputs.properties(expandProperties)

        filesMatching("**/*.*") {
            val exclusions = arrayOf(".png")
            if (!exclusions.any { path.endsWith(it) })
                expand(expandProperties)
        }
    }

    named<Jar>("jar") {
        manifest.attributes(
            "ModSide" to "BOTH",
            "FMLCorePlugin" to "${project.group}.redcore.RedCorePlugin",
            "FMLCorePluginContainsFMLMod" to "true",
            "ForceLoadAsMod" to "true",
        )
    }
}

base {
    archivesName.set(jarBaseName)
}
