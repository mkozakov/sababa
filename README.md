# Sababa Backend

Back-end component for Sababa.

## What is Sababa?

Sababa is a way to survey your contacts to see if they would be into an idea.

## What is Sababa Backend?

Sababa backend is a RESTful Java service for sending out Sababa requests, and
submitting Sababa responses.

Sababa Backend uses [Maven](https://maven.apache.org) and is written with
[Spring Boot](https://projects.spring.io/spring-boot/).

## Project structure and file naming

Under `./src/main/java/com/sababa` there are four directories:

- controller
- service
- repository
- data

All the routing is done using Controller classes in the `controller` directory.
Controller class names end with `Controller` (eg. DummyController`). Class
names are annotated with the Spring `@RestController` annotation.

Business logic is done in Service classes in the `service` directory.
Service class names end with `Service` (eg. `DummyService`). Class
names are annotated with the Spring `@Service` annotation.

Communication with databases is done in Repository classes
in the `repository` directory. Repository class names end with `Repository`
(eg. `DummyRepository`). Class names are annotated with the Spring
`@Repository` annotation.

All objects that represent storable resources live in the 'data' directory.
