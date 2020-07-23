# Vaadin web application with DB (PostgreSQL)

A test web application to work with the database of persons.

## Run

Run `mvn spring-boot:run`.

## Work with database

* Remove `DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class` classes from those excluded in @SpringBootApplication annotation in the `TaskApplication.java` file.
* Change repository in `PersonsServiceImpl`.
* Set database configuration in `application.properties`.
