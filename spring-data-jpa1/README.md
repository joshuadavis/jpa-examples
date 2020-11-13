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
1. A JDBC driver
1. Embedded Database

These will both be supplied by H2, for convenience.
