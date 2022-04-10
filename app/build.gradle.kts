plugins {
    kotlin("jvm")
    kotlin("plugin.serialization") version "1.6.10"
}

group = "vorobeij"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")

    implementation(project(":yfinance"))
}
