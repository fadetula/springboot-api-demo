# 🚀 Spring Boot API Demo

A clean, lightweight REST API built with **Spring Boot**, showcasing endpoints to manage a list of users. Designed for demonstration and freelance use — this project is ideal for startups, students, and Fiverr clients looking for high-quality backend work.

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.5-brightgreen)
![Gradle](https://img.shields.io/badge/Build-Gradle-important)
![Swagger](https://img.shields.io/badge/API-Documented-orange)

---

## 📦 Tech Stack

- Java 17
- Spring Boot 3.1.5
- Gradle
- REST API
- Swagger UI (via `springdoc-openapi`)
- In-memory data store (ConcurrentHashMap)

---

## 🎯 Features

- Create, retrieve, and delete users
- UUID-based user ID generation
- In-memory storage (no database needed)
- Swagger UI for live API documentation
- Easily customizable for other domains (e.g. tasks, products, etc.)

---

## 🧪 Endpoints

| Method | URL                  | Description         |
|--------|-----------------------|---------------------|
| GET    | `/api/users`          | List all users      |
| GET    | `/api/users/{id}`     | Get user by ID      |
| POST   | `/api/users`          | Create a new user   |
| DELETE | `/api/users/{id}`     | Delete a user       |

---

## 🧰 Getting Started

### 🔧 Prerequisites
- Java 17+
- Gradle 8.5+

### ▶️ Run It
```bash
./gradlew bootRun
```

---

## 📘 Swagger UI

Visit:  
[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

You'll see a fully interactive interface like this:

> *(Include a screenshot here once you have one)*

---

## 📁 Project Structure

```bash
src
└── main
    └── java
        └── com.example.demo
            ├── controller
            ├── model
            └── service
```

---

## 🧩 Future Enhancements

- Integrate MongoDB persistence
- Add DTOs and validation annotations
- Add JUnit + Mockito test coverage
- Containerize with Docker
- Deploy to Kubernetes via Helm

---

## 👋 Let's Work Together

Looking for a reliable Java backend developer for your REST API project?

📧 Reach out via [Fiverr](https://www.fiverr.com/) or contact me on [LinkedIn](https://www.linkedin.com/in/fadetula/)