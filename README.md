# TodoList REST API 📝

A simple REST API for managing todo tasks, built with Spring Boot and MySQL. This API allows you to create, retrieve, and manage tasks with data persistence and validation.

> ⚠️ **Note:** This project is currently under development.

## Features 🌟

- ✅ Create new tasks with validation (no blank tasks allowed)
- 📋 Retrieve all tasks
- ❌ Delete completed tasks
- 💾 MySQL persistence
- 🔍 Input validation
- 🧪 Comprehensive test coverage

## API Testing 🚀

This API is designed to be tested with Postman, making it easy to:
- Import the provided Postman collection
- Test all API endpoints
- Validate request/response formats
- Check error handling

## Status 🚦

### Implemented ✨
- Basic project structure
- Database configuration
- Task model setup

### In Progress 🔄
- API endpoints implementation
- Input validation
- Testing suite
- Documentation
- Postman collection creation

## Technical Specifications 🛠️

- Spring Boot 3.x
- MySQL for data persistence
- JPA/Hibernate
- JUnit for testing
- Java 17
- Postman for API testing

## API Endpoints (In Development) 🔌

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | /chores  | Create a new task |
| GET    | /chores  | Retrieve all tasks |
| DELETE | /chores/{id} | Remove a completed task |

## Getting Started 🚀

### Prerequisites 📋

- Java 17+
- MySQL 8.0+
- Maven
- Postman (for testing the API)

### Installation 💻

1. Clone the repository:

        git clone https://github.com/yourusername/TodoList-REST-API.git


2. Configure MySQL database in `application.properties`:
   

        spring.datasource.url=jdbc:mysql://localhost:3306/lista
        spring.datasource.username=root
        spring.datasource.password=your_password


3. Build the project:

        mvn clean install


4. Run the application:

        mvn spring-boot:run


5. Import the Postman collection (coming soon)

### Testing 🧪

Run the test suite:

        mvn test


## Project Structure 📂


      ├── main/
      │   ├── java/
      │   │   └── com/example/lista/
      │   │       ├── controller/
      │   │       ├── model/
      │   │       ├── repository/
      │   │       └── service/
      │   └── resources/
      │       └── application.properties
      └── test/
          └── java/
              └── com/example/lista/


## Contributing 🤝

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Open a Pull Request

## License 📄

This project is licensed under the MIT License - see the LICENSE file for details.
