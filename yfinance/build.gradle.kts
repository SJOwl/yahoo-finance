plugins {
    kotlin("jvm")
    kotlin("plugin.serialization") version "1.6.10"
    `maven-publish`
}

group = "vorobeij"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    withSourcesJar()
    // and/or analogously use “withJavadocJar()” to get a “javadocJar” task
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")

    // Networking
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.3")

    testImplementation("junit:junit:4.13.2")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "ru.vorobeij"
            artifactId = "yfinance"
            version = "1.0"

            from(components["java"])
        }
    }
}
