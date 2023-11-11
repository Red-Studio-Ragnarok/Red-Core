plugins {
    id("com.gtnewhorizons.retrofuturagradle") version "1.3.24"
}

val jarBaseName = "!Red-Core-MC-1.7-1.12"

minecraft {
    mcVersion = "1.12.2"
    username = "Desoroxxx"
    extraRunJvmArguments = listOf("-Dforge.logging.console.level=debug", "-Dfml.coreMods.load=${project.group}.redcore.RedCorePlugin")
    javaToolchain.get().vendor.set(JvmVendorSpec.ADOPTIUM)
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
        inheritOutputDirs = true // Fix resources in IJ-Native runs
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

    for (projectName in arrayOf("dummy")) {
        from(project(projectName).tasks.compileJava.get().outputs) {
            include("**/*.class")
        }
        dependsOn(project(projectName).tasks.compileJava.get())
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
