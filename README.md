# Library Management System API with Test Automation

## Overview

This project is a RESTful API application developed using Spring Boot for a Library Management System. It implements a robust backend system for managing books, copies, loans, and members in a library setting. The system includes four main entities with linked relational database tables and exposes CRUD operations for each entity.

## API Test Automation

This project includes comprehensive automated API tests using RestAssured, Cucumber for BDD. The tests are designed to verify the functionality of the API endpoints with JWT authentication for Books, Members, Copies, and Loans.

### Test Structure

The test files are located in the following structure:

```
librarymanagemenetsystem/
├── src/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── librarymanagementsystem/
│       │           ├── stepdefinitions/
│       │           │   └── ApiStepDefinitions.java
│       │           ├── LibrarymanagementsystemApplicationTests.java
│       │           └── TestRunner.java
│       └── resources/
│           └── features/
│               └── api_test.feature
```

### Feature File

The `api_test.feature` file contains BDD-style scenarios for testing various API endpoints. It covers the following main areas:

1. Books API endpoints
2. Members API endpoints
3. Copies API endpoints
4. Loans API endpoints 

Each area includes scenarios for:
- GET all items
- GET item by ID
- GET item by non-existing ID
- POST to create a new item
- PUT to update an existing item
- PUT to update a non-existing item
- DELETE an existing item
- DELETE a non-existing item

### Step Definitions

The `ApiStepDefinitions.java` file contains the implementation of the steps defined in the feature file. Key aspects include:

- JWT token handling for authenticated requests
- Making GET, POST, PUT, and DELETE requests using RestAssured
- Handling JSON payloads for POST and PUT requests
- Verifying response status codes and content

### Running the Tests

To run the API tests:

1. Ensure the application is running and accessible.
2. Execute the following command in the project root directory:

```
mvn test
```

This will run the TestRunner class, which executes the scenarios defined in the feature file.

### Test Runner Configuration

The `TestRunner.java` file is configured to run Cucumber tests with the following options:

```java
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/java/test/resources/features",
        glue = {"stepDefinitions"},
        plugin = {"pretty"}
)
public class TestRunner {
}
```

### Important Notes

- The tests use a JWT token for authentication. Make sure to update the token in `ApiStepDefinitions.java` if it expires.
- Some scenarios for the Loans API are not fully implemented due to logical dependencies between Books, Copies, and Loans.
- The tests cover both positive scenarios (e.g., successful operations) and negative scenarios (e.g., attempting operations on non-existing resources).

## Contributing

We welcome contributions to both the main project and the test suite. If you're adding new features, please ensure you also add appropriate test coverage in the `api_test.feature` file and implement the corresponding step definitions in `ApiStepDefinitions.java`.

Please ensure your code adheres to the existing style and passes all tests.

## Contact

Moon 
