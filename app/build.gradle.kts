plugins {
    java
}

group = "vorobeij"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":yfinance"))
}
