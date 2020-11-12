
plugins {
    id("org.springframework.boot") apply false
    id("io.spring.dependency-management")
    java
}

group = "examples.jpa"
version = "0.0.1-SNAPSHOT"

allprojects {
    apply(plugin = "io.spring.dependency-management")

    dependencyManagement {
        imports {
            mavenBom("org.testcontainers:testcontainers-bom:1.15.0")
        }
    }

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")

    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter-api")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
