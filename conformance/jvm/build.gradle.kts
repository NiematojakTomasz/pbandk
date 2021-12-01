plugins {
    kotlin("jvm")
    application
}

application {
    mainClassName = "pbandk.conformance.MainKt"
    applicationName = "conformance"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

dependencies {
    implementation(project(":conformance:conformance-lib"))
}