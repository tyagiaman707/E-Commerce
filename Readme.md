# Ecommerce-API

It is an Ecommerce API built with Java using Spring Boot and Hibernate.

## Languages Used:
-Java 11

-Maven

-Spring Boot

-Hibernate

-H2 Database

-Swagger

## Data Flow:

### Controller-

The controller layer handles incoming requests and sends responses back to the client. It maps URLs to appropriate methods and uses DTOs (Data Transfer Objects) to communicate with the service layer.

### Services-

The service layer implements business logic and performs operations on the data, such as creating, reading, updating, and deleting entities. It uses repositories to communicate with the database and maps entities to DTOs to communicate with the controller layer.

### Repository-

The repository layer handles database operations, such as retrieving and storing data, and uses Hibernate as the ORM (Object-Relational Mapping) tool to map Java objects to database tables.

## Database Design:

The database design includes the following entities:

-User

-Product

-Order

-Address

The User entity has a one-to-many relationship with the Order entity, meaning that one user can have multiple orders. The Product entity is not directly related to any other entities. The Order entity has a many-to-one relationship with both the User and Product entities, meaning that many orders can belong to one user or one product. The Address entity has a many-to-one relationship with the User entity, meaning that one user can have multiple addresses.

## Data Structures Used:

DTOs (Data Transfer Objects) - used to transfer data between the controller and service layers

Entities - used to model database tables and perform CRUD (Create, Read, Update, Delete) operations

Repositories - used to perform database operations and communicate with the service layer

Services - used to implement business logic and communicate with the repository layer


## Project Summary:

This API allows users to create and manage orders for products in an ecommerce store. Users can create an account, view products by category, add products to their cart, and place orders. The API also provides endpoints for retrieving user and order data

## Links:

-Swagger UI: http://localhost:8080/swagger-ui.html

-H2 Console: http://localhost:8080/h2-console
