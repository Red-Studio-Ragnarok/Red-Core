plugins {
    id("com.github.gmazzo.buildconfig") version "5.5.1"
}

val id = "redcore"
val jarBaseName = "Red-Core"

val jafamaVersion = "2.3.2"

val log4jVersion = "2.17.1" // Forged

val jUnitVersion = "5.10.1"

dependencies {
    embed("net.jafama", "jafama", jafamaVersion)

    compileOnly("org.apache.logging.log4j", "log4j-api", log4jVersion)

    testImplementation("org.junit.jupiter", "junit-jupiter", jUnitVersion)
    testImplementation("org.apache.logging.log4j", "log4j-api", log4jVersion)
    testImplementation("org.apache.logging.log4j", "log4j-core", log4jVersion)
}

buildConfig {
    packageName("${project.group}.${id}")
    className("ProjectConstants")
    documentation.set("This class defines constants for ${project.name}.\n<p>\nThey are automatically updated by Gradle.")

    useJavaOutput()

    // Details
    buildConfigField("ID", id)
    buildConfigField("NAME", project.name)
    buildConfigField("VERSION", project.version.toString())

    // Loggers
    buildConfigField("org.apache.logging.log4j.Logger", "LOGGER", "org.apache.logging.log4j.LogManager.getLogger(NAME)")
    buildConfigField("dev.redstudio.redcore.logging.RedLogger", "RED_LOGGER", "new RedLogger(NAME, \"https://linkify.cz/RedCoreBugReport\", LOGGER)")
}

tasks {
    test {
        useJUnitPlatform()
        javaLauncher.set(project.javaToolchains.launcherFor {
            languageVersion = JavaLanguageVersion.of(8)
        })
    }
}

base {
    archivesName.set(jarBaseName)
}
