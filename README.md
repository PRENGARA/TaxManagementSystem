# TMS (Tax Management System)

## Project Overview

TMS is a Spring Boot backend system for managing tax-related operations such as submitting tax claims, computing taxes, and supporting multiple languages (internationalization). It provides RESTful APIs to interact with the system, enabling frontend clients or other services to submit claims and perform tax calculations efficiently.

---

## Features

- **Tax Claim Management:**  
  Users can submit and retrieve tax claims.

- **Tax Computation:**  
  Implements business logic for tax calculations.

- **RESTful API Interface:**  
  Exposes endpoints for managing claims and performing tax-related operations.

- **Internationalization (i18n):**  
  Supports multiple languages via resource bundles and locale configuration.

- **Spring Boot Framework:**  
  Built with Spring Boot for easy setup and deployment.

---

## Project Structure

| Component                  | Description                                    |
|----------------------------|------------------------------------------------|
| `UserClaim.java`           | Entity class representing user tax claims.    |
| `TaxService.java`          | Interface defining tax computation methods.   |
| `TaxServiceImpl.java`      | Implementation of tax computation logic.       |
| `TaxController.java`       | REST controller exposing API endpoints.        |
| `InternationalizationConfig.java` | Configures locale resolver and message sources for i18n. |
| `messages.properties`, `messages_de.properties` | Language resource files for English, German, etc. |
| `TmsApplication.java`      | Main application starter class annotated with `@SpringBootApplication`. |
| `application.properties`   | Configuration file for server port, logging, i18n settings, etc. |

---

## Prerequisites

- Java JDK 17 or higher  
- Maven 3.x (or Gradle if configured)  
- IDE (optional) like IntelliJ IDEA, Eclipse, or VSCode  
- Postman or curl for API testing  

---

## Setup and Running Instructions

### 1. Clone the Repository

```bash
git clone <your-repo-url>
cd tms
mvn clean install
mvn spring-boot:run
java -jar target/tms-0.0.1-SNAPSHOT.jar
http://localhost:8080
| Method | Endpoint             | Description                       | Request Body / Params                       |
| ------ | -------------------- | --------------------------------- | ------------------------------------------- |
| POST   | `/api/claims`        | Submit a new tax claim            | JSON payload with claim data                |
| GET    | `/api/claims/{id}`   | Get a tax claim by ID             | Path variable `id`                          |
| GET    | `/api/tax/calculate` | Compute tax based on query params | Query parameters (e.g., income, deductions) |
