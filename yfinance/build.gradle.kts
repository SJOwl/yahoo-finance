plugins {
    java
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
    implementation("de.sfuhrm:YahooFinanceAPI:3.16.3")

    // Networking
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.2.1")

    testImplementation("junit:junit:4.13.2")
}
