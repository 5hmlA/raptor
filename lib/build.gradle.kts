plugins {
    kotlin("jvm") version "1.9.23"
    `maven-publish`
}

//apply<Raptor>()

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.okhttp)
//    implementation(gradleApi())
    testImplementation(kotlin("test"))
}