plugins {
    kotlin("jvm") version "1.9.23"
    `kotlin-dsl`
    `java-gradle-plugin`
    `maven-publish`
}

group = "io.github.5hmla"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.okhttp)
//    implementation(gradleApi())
}


gradlePlugin {
    website = "https://github.com/5hmlA/raptor"
    vcsUrl = "https://github.com/5hmlA/raptor"
    plugins {
        register("raptor-config") {
            id = "${group}.raptor"
            displayName = "publish config plugin"
            description = "atomic publish library to central-portal"
            tags = listOf("config", "publish", "library")
            implementationClass = "osp.Raptor"
        }
    }
}