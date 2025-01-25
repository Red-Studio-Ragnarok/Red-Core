plugins {
    id("com.gtnewhorizons.retrofuturagradle") version "1.4.2"
}

val jarBaseName = "!Red-Core-MC-1.8-1.12"

val jafamaVersion = "2.3.2"

minecraft {
    mcVersion = "1.12.2"
    username = "Desoroxxx"
    extraRunJvmArguments = listOf("-Dforge.logging.console.level=debug", "-Dfml.coreMods.load=${project.group}.redcore.RedCorePlugin")
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
    processResources.configure {
        inputs.property("version", project.version)

        filesMatching("mcmod.info") {
            expand(mapOf("version" to project.version))
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
