<h1 align="center">
    <a href="#" alt="Spring Boot Todo List">Spring Boot Todo List</a>
</h1>

<h3 align="center">
    A RESTful Todo List API built with Spring Boot and JPA
</h3>

<p align="center">
    <a href="https://github.com/efernandes-tech/spring-001-ef-to-do-list/commits/main">
        <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/efernandes-tech/spring-001-ef-to-do-list" />
    </a>
    <img alt="Repository size" src="https://img.shields.io/github/repo-size/efernandes-tech/spring-001-ef-to-do-list">
    <a href="https://edersonfernandes.com.br">
        <img alt="made by @efernandes-tech" src="https://img.shields.io/badge/Made_by-@efernandes%E2%80%93tech-blue">
    </a>

</p>

<h4 align="center">
    Status: In progress
</h4>

<p align="center">
    <a href="#about">About</a> •
    <a href="#features">Features</a> •
    <a href="#how-it-works">How it works</a> •
    <a href="#tech-stack">Tech Stack</a> •
    <a href="#author">Author</a>
</p>

## About

A simple Todo List REST API built with Spring Boot, JPA/Hibernate, and H2 database. This project demonstrates CRUD operations with a clean architecture using Repository, Service, and Controller layers.

---

## Features

-   [x] RESTful API endpoints for CRUD operations
-   [x] JPA/Hibernate integration with H2 database
-   [x] Todo entity with title, description, and completed status
-   [x] Service layer for business logic
-   [x] Repository layer for data access

---

## How it works

### Pre-requisites

Before you begin, you will need to have the following tools installed:
[Git](https://git-scm.com), [Java 17+](https://www.oracle.com/java/technologies/downloads/), [Maven](https://maven.apache.org/).

#### Running the Backend

```bash
# Clone this repository
git clone https://github.com/efernandes-tech/spring-001-ef-to-do-list.git

# Access the backend folder
cd spring-001-ef-to-do-list/backend/todo

# Run the application using Maven wrapper
./mvnw spring-boot:run

# The server will start at port: 8080
# API endpoints available at http://localhost:8080/api/todos
# H2 Console available at http://localhost:8080/h2-console
```

#### API Endpoints

```bash
# Get all todos
GET http://localhost:8080/api/todos

# Get todo by ID
GET http://localhost:8080/api/todos/{id}

# Create new todo
POST http://localhost:8080/api/todos
Content-Type: application/json
{
  "title": "Learn Spring Boot",
  "description": "Build awesome apps",
  "completed": false
}

# Update todo
PUT http://localhost:8080/api/todos/{id}
Content-Type: application/json
{
  "title": "Learn Spring Boot",
  "description": "Build awesome apps",
  "completed": true
}

# Delete todo
DELETE http://localhost:8080/api/todos/{id}
```

---

## Tech Stack

**Backend:**

-   [Spring Boot 3.5.6](https://spring.io/projects/spring-boot)
-   [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
-   [Hibernate](https://hibernate.org/)
-   [H2 Database](https://www.h2database.com/)
-   [Lombok](https://projectlombok.org/)
-   [Maven](https://maven.apache.org/)
-   [Java 17](https://www.oracle.com/java/technologies/downloads/)

**Tools:**

-   [Visual Studio Code](https://code.visualstudio.com/)
-   [Postman](https://www.postman.com/)
-   [Git](https://git-scm.com/)

---

## Author

<a href="https://github.com/efernandes-tech">
    <img style="border-radius: 50%;" src="https://github.com/efernandes-tech.png" width="100px;" alt="Éderson Fernandes" />
    <br />
    <sub><b>Éderson Fernandes</b></sub>
</a>

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?logo=linkedin)](https://www.linkedin.com/in/efernandes-tech)
[![Email](https://img.shields.io/badge/Email-Contact-red?logo=gmail)](mailto:efernandes.tech@gmail.com)
