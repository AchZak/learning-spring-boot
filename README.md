# Learning Spring Boot

![Java Version](https://img.shields.io/badge/Java%20SE-17-blue)
![Spring Boot Version](https://img.shields.io/badge/Spring%20Boot-3.1.2-green)
![Docker Version](https://img.shields.io/badge/Docker-24.0.2-blue)

Welcome to the "Learning Spring Boot" repository! This project serves as a showcase of my journey into becoming a Java software developer, where I explore and implement various fundamental concepts of Spring Boot. Through this project, I gained hands-on experience in setting up a Maven project, using Docker to containerize my application, configuring a PostgreSQL database, and creating basic CRUD (Create, Read, Update, Delete) operations for a "Customer" entity.

## Features

- Implemented a Spring Boot application using N-tier architecture, with proper package structure and classes following industry best practices.
- Structured the application into distinct layers, including the Controller layer for handling incoming HTTP requests, the Service layer for business logic and data manipulation, and the Repository layer for interacting with the PostgreSQL database.
- Configured Docker to manage a PostgreSQL database and containerize the application for easy deployment.
- Utilized Spring Data JPA and Hibernate to interact with the PostgreSQL database.
- Created RESTful APIs for basic CRUD operations on the "Customer" entity.
- Utilized Postman for testing the RESTful APIs and ensuring the proper functionality of the endpoints.
- Demonstrated proficiency in Java SE 17 and JDK 17 syntax and leveraged Lombok for cleaner code.

## Prerequisites

To run this application locally, make sure you have the following software installed:

- Java Development Kit (JDK) 17
- Apache Maven
- Docker Desktop with Docker Engine 24.0.2 or higher

## Getting Started

1. Clone this repository to your local machine.
2. Ensure you have the necessary dependencies installed:
   - IntelliJ IDEA will automatically handle the Maven dependencies for you.
   - If you prefer using the terminal, you can run `mvn clean install`.
3. Start Docker Desktop and run the provided `docker-compose.yml` file to set up the PostgreSQL database.
4. Navigate to the project root directory and execute the following command to build and run the application:
   - Using IntelliJ IDEA: Simply click on the "Run" or "Debug" button to build and run the project.
   - Using the terminal: Run `mvn spring-boot:run`.
5. Once the application is running, you can access the API endpoints using Postman or any other REST API client.

## API Endpoints

- **GET** `/api/v1/customers` - Retrieve a list of all customers.
- **POST** `/api/v1/customers` - Create a new customer. (Request Body: NewCustomerRequest)
- **DELETE** `/api/v1/customers/{customerId}` - Delete a customer by ID.
- **PUT** `/api/v1/customers/{customerId}` - Update a customer by ID. (Request Body: UpdateCustomerRequest)

## Contributions

This project is a personal learning endeavor, but I welcome contributions and feedback. Feel free to open issues for bug reports or suggestions for improvements.

## Screenshots

| Screenshot 1 | Screenshot 2 |
|--------------|--------------|
| ![Screenshot 1](screenshots/screenshot1.png) | ![Screenshot 2](screenshots/screenshot2.png) |

| Screenshot 3 | Screenshot 4 |
|--------------|--------------|
| ![Screenshot 3](screenshots/screenshot3.png) | ![Screenshot 4](screenshots/screenshot4.png) |

| Screenshot 5 | Screenshot 6 |
|--------------|--------------|
| ![Screenshot 5](screenshots/screenshot5.png) | ![Screenshot 6](screenshots/screenshot6.png) |

| Screenshot 7 | Screenshot 8 |
|--------------|--------------|
| ![Screenshot 7](screenshots/screenshot7.png) | ![Screenshot 8](screenshots/screenshot8.png) |
