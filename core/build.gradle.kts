plugins {
    id("com.github.gmazzo.buildconfig") version "4.1.2"
}

val log4jVersion = "2.17.1"

dependencies {
    embed("net.jafama", "jafama", "2.3.2")

    compileOnly("org.apache.logging.log4j", "log4j-api", log4jVersion)
    compileOnly("org.apache.logging.log4j", "log4j-core", log4jVersion)
}

buildConfig {
    packageName(project.group.toString() + ".redcore")
    className("ProjectConstants")

    useJavaOutput()
    buildConfigField("String", "NAME", provider { "\"Red Core\"" })
    buildConfigField("String", "VERSION", provider { "\"${project.version}\"" })
    buildConfigField("org.apache.logging.log4j.Logger", "LOGGER", "org.apache.logging.log4j.LogManager.getLogger(NAME)")
    buildConfigField("dev.redstudio.redcore.logging.RedLogger", "RED_LOGGER", "new RedLogger(NAME, \"https://linkify.cz/RedCoreBugReport\", LOGGER)")
}

tasks.named<Jar>("jar") {
    archiveBaseName = "Red-Core"
}

tasks.named<Jar>("sourcesJar") {
    archiveBaseName = "Red-Core"
}

publishing.publications.register("redCore", MavenPublication::class) {
    from(components["java"])

    groupId = project.group.toString()
    artifactId = "red-core"
    version = project.version.toString()
}
