# Spring Boot API Demo

A simple Spring Boot REST API to manage users. Demonstrates:

- Spring Boot 3.x
- RESTful endpoints
- In-memory storage
- UUID generation

## Endpoints

| Method | Endpoint        | Description         |
|--------|------------------|---------------------|
| GET    | `/api/users`     | List all users      |
| GET    | `/api/users/{id}`| Get user by ID      |
| POST   | `/api/users`     | Create new user     |
| DELETE | `/api/users/{id}`| Delete user by ID   |

## Run
```bash
./gradlew bootRun
```