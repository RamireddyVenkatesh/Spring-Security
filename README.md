# Spring-Security
# Spring Security Bank Application

This is a simple Spring Boot application that demonstrates the use of **Spring Security** for securing REST endpoints, user authentication, and registration functionality. The project includes basic user management and a RESTful API for managing a list of students.

## Features

- **User Authentication**: Uses Spring Security for basic authentication.
- **User Registration**: Registers users with encrypted passwords using BCrypt.
- **REST APIs**: Manage users and students with REST endpoints.
- **CSRF Protection**: Includes CSRF token handling for secure form submissions.
- **Role-based Access**: Secured routes based on roles (USER/ADMIN).

## Project Structure

The project follows the typical Spring Boot structure:

### Key Classes

1. **`SprigSecurityApplication`**: The main class to run the Spring Boot application.
   
2. **`SpringSecurity` (Config)**:
   - Configures Spring Security to disable CSRF, enforce stateless sessions, and provide basic authentication using `DaoAuthenticationProvider`.
   - The authentication provider uses `BCryptPasswordEncoder` to secure passwords.

3. **`UserPrincipal`**: Implements `UserDetails` to wrap around the `Users` model for authentication purposes.

4. **`UserController`**: Handles user registration (`/register`) using POST requests.

5. **`StudentController`**: Provides endpoints to manage the `Student` model, including retrieving all students and adding new students.

6. **`MyUserDetailsService`**: Implements `UserDetailsService` for loading user details from the database during authentication.

7. **`UserService`**: Provides user registration services with password encoding.

## API Endpoints

### Public Endpoints

- `POST /register`: Register a new user by providing username and password in the request body.

### Secured Endpoints (Require Authentication)

- `GET /students`: Retrieve a list of students. Requires valid credentials.
- `POST /students`: Add a new student to the list.
- `GET /csrf-token`: Retrieve the CSRF token for secure requests.

### Home Page

- `GET /`: A simple home page that returns a welcome message along with the session ID.

## Setup and Run Instructions

### Prerequisites

- **JDK 8 or higher**
- **Maven** or **Gradle** (for building the project)
- **MySQL** (if using database for storing users, or use H2 for in-memory DB)
- **Postman** (or any API client for testing the endpoints)

### Steps to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/RamireddyVenkatesh/SpringSecurity.git
