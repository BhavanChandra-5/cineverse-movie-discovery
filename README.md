# CineVerse — Movie Discovery Platform

CineVerse is a full-stack movie discovery application built using Java, Spring Boot, Spring Data JPA, MySQL, HTML, CSS, and JavaScript. It demonstrates how a web frontend communicates with a Java backend to retrieve movie information through REST APIs.

## 🚀 Features

- Letter-based movie search.
- Movie-name suggestions and search operations.
- REST API development using Spring Boot.
- Layered Controller–Service–Repository architecture.
- Database integration using Spring Data JPA and Hibernate.
- Frontend-backend communication using the Fetch API and JSON.
- Maven-based dependency management.

## 🛠️ Technology Stack

- **Backend:** Java 21, Spring Boot
- **Persistence:** Spring Data JPA, Hibernate
- **Database:** MySQL
- **Frontend:** HTML5, CSS3, JavaScript
- **API Communication:** REST, HTTP, JSON
- **Build Tool:** Maven
- **IDE:** Eclipse

## 🏗️ Architecture

CineVerse follows a layered architecture to separate request handling, business logic, and database operations.

```text
Browser / Frontend
        |
        v
HTML + CSS + JavaScript
        |
        | HTTP Request / JSON Response
        v
MovieController
        |
        v
MovieService
        |
        v
MovieRepository
        |
        v
Spring Data JPA / Hibernate
        |
        v
MySQL Database
```

## 📁 Project Structure

```text
cineverse-movie-discovery/
├── pom.xml
├── mvnw
├── mvnw.cmd
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/azrecommendation/
    │   │       ├── AzRecommendationApplication.java
    │   │       ├── controller/
    │   │       │   └── MovieController.java
    │   │       ├── service/
    │   │       │   └── MovieService.java
    │   │       ├── repository/
    │   │       │   └── MovieRepository.java
    │   │       └── movieentity/
    │   │           └── MovieEntity.java
    │   └── resources/
    │       ├── application.properties
    │       └── static/
    │           ├── index.html
    │           ├── style.css
    │           └── script.js
    └── test/
```

## ⚙️ How It Works

1. The user enters a letter or movie name in the frontend.
2. JavaScript handles the user interaction and sends an HTTP request using the Fetch API.
3. `MovieController` receives the request and calls `MovieService`.
4. `MovieService` delegates data retrieval to `MovieRepository`.
5. Spring Data JPA and Hibernate handle database operations.
6. The retrieved movie records are returned through the backend as a response.
7. JavaScript processes the response and updates the webpage to display the results.

## ▶️ Getting Started

### Prerequisites

- Java Development Kit (JDK) 21
- MySQL Server
- Eclipse IDE or another Java IDE with Maven support
- Git

### Database Configuration

1. Start your MySQL server.
2. Create the database configured for your application.
3. Configure the datasource URL, username, and password in your local `application.properties` file.

Example configuration format:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

Replace `your_database` with your database name and configure the environment variables for your local setup.

**Security:** Never commit actual database passwords, access tokens, or other secrets to a public repository.

### Run Using Eclipse

1. Import the project as an existing Maven project.
2. Wait for Maven dependencies to resolve.
3. Ensure MySQL is running and the database configuration is correct.
4. Open `AzRecommendationApplication.java`.
5. Select **Run As → Java Application**.
6. Wait for the application to start successfully in the Eclipse Console.
7. Open `http://localhost:8080/` in your browser.

If the root URL does not display the frontend, try `http://localhost:8080/index.html`.

### Run Using Maven

**Windows**

```bat
mvnw.cmd spring-boot:run
```

**macOS/Linux**

```bash
./mvnw spring-boot:run
```

## 🧪 Troubleshooting

| Problem | What to check |
|---|---|
| Application fails to start | Check the Eclipse Console for the first meaningful error. |
| Database connection failure | Verify MySQL is running and the datasource configuration is correct. |
| Port 8080 is occupied | Stop the process using the port or configure another port. |
| Frontend page not found | Check that `index.html` is inside `src/main/resources/static/`. |
| Search returns no results | Verify the database records, controller mappings, and browser console. |
| Main class not found in Eclipse | Update the Maven project, clean the project, and run the main application class again. |

## 🔮 Future Enhancements

- Add input validation and centralized exception handling.
- Add automated unit and integration tests.
- Implement pagination, sorting, and additional movie filters.
- Improve API documentation.
- Add deployment configuration.
- Explore user accounts and personalized recommendations.

These are potential enhancements and are not claims about features currently implemented.

## 👨‍💻 Learning Outcomes

This project provides practical experience with:

- Java backend development.
- Spring Boot application structure.
- REST API development and HTTP communication.
- Layered architecture and separation of concerns.
- Spring Data JPA, Hibernate, and MySQL integration.
- Frontend-backend integration.
- Maven dependency management.
- Debugging and running a full-stack Java application.

---

**CineVerse — Discover Movies, One Letter at a Time.**
