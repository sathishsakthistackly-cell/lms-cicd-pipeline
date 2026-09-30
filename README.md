# Sample LMS Backend

Simple Spring Boot LMS backend for the LMS 502 Bad Gateway troubleshooting task.

## Requirements
- Java 21
- Maven 3.9+

## Build
```bash
mvn clean package -DskipTests
```

## Run
```bash
java -jar target/lms-backend-1.0.0.jar
```

## Test
```bash
curl http://localhost:8080/health
curl http://localhost:8080/api/courses
```

The application listens on port 8080.

This sample intentionally keeps course data in memory so the Nginx/backend 502 troubleshooting can be performed without requiring a database.
