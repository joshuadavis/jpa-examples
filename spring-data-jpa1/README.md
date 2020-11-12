spring-data-jpa1
============

This is a simple example illustrating some fundamental concepts when using JPA with:
* Spring Boot and Spring Data JPA
* Postgres database
* Flyaway for database schema management

### Project Setup

The initial project was created with start.spring.io (Initializr), and modified to fit into the root Gradle
project as a sub-project.

#### Dependencies

We're going to use the Spring DependencyManagement plugin, which will manage all the versions for us.
The main dependency is `org.springframework.boot:spring-boot-starter-data-jpa`, which will bring in most of what we need.

We also need:
1. The postgres JDBC driver
1. Embedded Postgres Database

### Embedded Postgres Database

The first thing we need to set up is a Postgres compatible database that is embedded in the JVM for testing and
convenient non-production use.

A popular option here is `postgresql-embedded`, but this been superseded by `org.testcontainers:postgresql`.
Testcontainers requires docker, so keep that in mind.

More information on TestContainers Postgres support:
* https://www.baeldung.com/spring-boot-testcontainers-integration-test
* https://www.testcontainers.org/modules/databases/postgres/
