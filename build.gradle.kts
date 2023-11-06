plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.20"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.24.2")
    testImplementation("com.approvaltests:approvaltests:22.2.0")
    testImplementation("net.jqwik:jqwik:1.8.1")
}

tasks {
    test {
        useJUnitPlatform {
            includeEngines("jqwik", "junit-jupiter")
        }

        testLogging.exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        testLogging.showCauses = true
    }
}