
plugins {
    // Don't apply spring boot plugin to all sub-projects.
    id("org.springframework.boot") version "2.2.11.RELEASE" apply false
    id("io.spring.dependency-management") version "1.0.10.RELEASE" apply false
    java
}

group = "examples.jpa"
version = "0.0.1-SNAPSHOT"


allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "java")

    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter-api")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}

/*
plugins {
	id 'org.springframework.boot' version '2.2.11.RELEASE'
	id 'io.spring.dependency-management' version '1.0.10.RELEASE'
	id 'java'
}

group = 'example.jpa'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
	mavenCentral()
}

dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation 'org.flywaydb:flyway-core'
	runtimeOnly 'org.postgresql:postgresql'
	testImplementation('org.springframework.boot:spring-boot-starter-test') {
		exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
	}
}

test {
	useJUnitPlatform()
}
*/
