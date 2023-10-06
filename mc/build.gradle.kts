plugins {
    id("com.gtnewhorizons.retrofuturagradle") version "1.3.24"
}

minecraft {
    mcVersion = "1.12.2"
    username = "Desoroxxx"
    extraRunJvmArguments = listOf("-Dforge.logging.console.level=debug", "-Dfml.coreMods.load=${project.group}.redcore.RedCorePlugin")
}

dependencies {
    embed(project(":core"))

    implementation("net.jafama", "jafama", "2.3.2")
}

idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
        inheritOutputDirs = true // Fix resources in IJ-Native runs
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

    archiveBaseName = "!Red-Core-MC-1.12.2"
}

tasks.named<Jar>("sourcesJar") {
    archiveBaseName = "!Red-Core-MC-1.12.2"
}


publishing.publications.register("redCoreMc", MavenPublication::class) {
    from(components["java"])

    groupId = project.group.toString()
    artifactId = "red-core-mc"
    version = project.version.toString()
}
