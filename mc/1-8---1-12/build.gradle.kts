plugins {
    id("com.gtnewhorizons.retrofuturagradle") version "1.3.35"
}

val jarBaseName = "!Red-Core-MC-1.8-1.12"

minecraft {
    mcVersion = "1.12.2"
    username = "Desoroxxx"
    extraRunJvmArguments = listOf("-Dforge.logging.console.level=debug", "-Dfml.coreMods.load=${project.group}.redcore.RedCorePlugin")
}

dependencies {
    embed(project(":core"))
    embed(project(":mc:common"))

    implementation("net.jafama", "jafama", "2.3.2")
}

idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
        inheritOutputDirs = true
    }
}

tasks.processResources.configure {
    inputs.property("version", project.version)

    filesMatching("mcmod.info") {
        expand(mapOf("version" to project.version))
    }
}

tasks.named<Jar>("jar") {
    manifest {
        attributes(
            "ModSide" to "BOTH",
            "FMLCorePlugin" to "${project.group}.redcore.RedCorePlugin",
            "FMLCorePluginContainsFMLMod" to "true",
            "ForceLoadAsMod" to "true"
        )
    }

    archiveBaseName = jarBaseName
}

tasks.named<Jar>("sourcesJar") {
    archiveBaseName = jarBaseName
}

publishing.publications.register("redCoreMc", MavenPublication::class) {
    from(components["java"])

    groupId = project.group.toString()
    artifactId = "red-core-mc"
    version = project.version.toString()
}
