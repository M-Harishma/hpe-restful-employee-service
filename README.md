# HPE RESTful Employee Service

A RESTful web service built with **Java** and **Spring Boot** that manages employee data via `GET` and `POST` requests. Developed during the **HPE Software Engineering Virtual Experience Program** on [Forage](https://www.theforage.com/).

## Overview

This project simulates a basic backend system that a company might use to manage employee records. It exposes a clean, standard REST API that external clients — a browser, Postman, or another application — can interact with over HTTP to retrieve and add employee data.

## Features

- **`GET /employees`** — Returns the full list of employees as JSON
- **`POST /employees`** — Accepts JSON data and adds a new employee to the system
- Unit tests written with **JUnit** to verify core application behavior
- Builds into a standalone executable `.jar` file

## Tech Stack

- **Java**
- **Spring Boot**
- **Gradle** (build tool)
- **JUnit** (unit testing)

## Project Structure

| File | Responsibility |
|---|---|
| `RestServiceApplication.java` | Application entry point; starts the Spring Boot app |
| `Employee.java` | Data model representing a single employee (fields, getters, setters) |
| `Employees.java` | Holds the collection of all employee records |
| `EmployeeManager.java` | Initializes the system with sample employee data |
| `EmployeeController.java` | Handles incoming HTTP requests (`GET` / `POST`) and routes them |

## Example JSON Response

```json
{
  "employeeList": [
    {
      "employee_id": 1,
      "first_name": "Hari",
      "last_name": "Sri",
      "email": "hari123@gmail.com",
      "title": "Manager"
    }
  ]
}
```

## How to Run

Clone the repository, then from the project root:

```bash
./gradlew build
java -jar build/libs/demo-0.0.1-SNAPSHOT.jar
```

The service will start on **port 8080**. Visit:

```
http://localhost:8080/employees
```

## Testing the POST Endpoint

Using Postman, PowerShell, or any HTTP client, send a `POST` request to `http://localhost:8080/employees` with a JSON body:

```json
{
  "employee_id": 6,
  "first_name": "Jerin",
  "last_name": "Jenifer",
  "email": "jerry01@gmail.com",
  "title": "Quality Analyser"
}
```

## Running Unit Tests

```bash
./gradlew test
```

## What I Learned

Building this project from scratch involved:

- Setting up a Java and Gradle development environment
- Understanding how **HTTP** methods (GET, POST) and **REST** API design work together
- Learning how **JSON** serialization and deserialization connects Java objects to web requests
- Using Spring Boot annotations (`@RestController`, `@GetMapping`, `@PostMapping`, `@RequestBody`)
- Writing and running unit tests with **JUnit**
- Debugging real compilation and runtime errors throughout development

## Acknowledgements

This project was completed as part of the **Hewlett Packard Enterprise Software Engineering Virtual Experience** on [Forage](https://www.theforage.com/simulations/hewlett-packard-enterprise/software-engineering-pcij).
