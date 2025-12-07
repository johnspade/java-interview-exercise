# User Service - Technical Interview Exercise

A minimal Spring Boot application for a pair programming interview exercise.

## Quick Start

```bash
# Run the application
./mvnw spring-boot:run

# Run tests
./mvnw test

# Test the existing endpoint
curl http://localhost:8080/api/users/1
```

## Project Structure

```
src/main/java/com/example/userservice/
├── UserServiceApplication.java    # Main application
├── client/
│   └── JsonPlaceholderClient.java # HTTP client (already implemented)
├── controller/
│   └── UserController.java        # REST endpoints
├── dto/
│   ├── User.java                  # User record
│   ├── Post.java                  # Post record
│   └── UserSummary.java           # Combined response record
└── service/
    └── UserService.java           # Business logic (has TODO)

src/test/java/com/example/userservice/
└── service/
    └── UserServiceTest.java       # Unit tests (has TODO)
```

## Task:

Implement `UserService.getUserSummary()` method

The method should:
1. Fetch the user using `client.getUser(userId)`
2. Fetch the user's posts using `client.getPostsByUser(userId)`
3. Return a `UserSummary` with combined data
