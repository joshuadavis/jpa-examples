
pluginManagement {
    repositories {
    }
    plugins {
        id("org.springframework.boot") version "2.2.11.RELEASE"
        id("io.spring.dependency-management") version "1.0.10.RELEASE"
    }
}

rootProject.name = "jpa-examples"
include("spring-data-jpa1")