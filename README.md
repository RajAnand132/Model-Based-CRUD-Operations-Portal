# <h1 align="center"> Model-Based CRUD Operations Portal</h1>
<p align="center">
  <a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
  </a>
  <a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
  </a>
  <a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.3-brightgreen.svg" />
  </a>
   <img alt = "GPL v3" src="https://img.shields.io/badge/License-GPLv3-blue.svg" />
</p>

---

<p align="left">

## Overview

This project is a Model-Based CRUD (Create, Read, Update, Delete) Operations Portal that demonstrates the management of various relationships between entities using the Java Spring Boot framework with JPA (Java Persistence API). The project focuses on handling one-to-one, one-to-many, many-to-one, and many-to-many relationships. It includes primary entities representing different aspects of a typical educational system.

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

## Entity Descriptions:

### Student
- Represents a student in the educational system.
- Attributes: ID, name, age, phoneNumber, branch, department.
- One-to-one relationship with an Address entity.
- One-to-many relationship with multiple Course entities.

### Laptop
- Represents a laptop owned by a student.
- Attributes: ID, name, brand, price.
- One-to-one relationship with a Student entity.

### Course
- Represents a course offered in the educational system.
- Attributes: ID, title, description, duration.
- Many-to-many relationship with Student entities.

### Book
- Represents a book that students can borrow or own.
- Attributes: ID, title, author, description, price.
- Many-to-one relationship with a Student entity.

### Address
- Represents the address of a student.
- Attributes: addressId, landmark, zipcode, district, state, country.

**Functionality:**

The project provides CRUD operations for each entity, allowing users to:

- **Create**: Add new records of students, laptops, courses, books, and addresses.
- **Read**: Retrieve information about students, laptops, courses, books, and addresses.
- **Update**: Modify existing records, such as updating student details, changing laptop ownership, or editing course information.
- **Delete**: Remove records from the system, including deleting students, laptops, courses, books, and addresses.

## Data Flow Diagram



                            ┌─────────────────────────┐
                            │   E-commerce API        │
                            └───────────┬─────────────┘
                                        │
                                        ▼
                            ┌─────────────────────────┐
                            │       Controllers       │
                            └───────────┬─────────────┘
                                        │
                                        ▼
                            ┌─────────────────────────┐
                            │       Services          │
                            └───────────┬─────────────┘
                                        │
                                        ▼
                            ┌─────────────────────────┐
                            │       Repositories      │
                            └───────────┬─────────────┘
                                        │
                                        ▼
                            ┌─────────────────────────┐
                            │       Database          │
                            └─────────────────────────┘


## Endpoints:

The CRUD operations are exposed through API endpoints. Example endpoints include:

- `POST /students`: Create a new student.
- `GET /students/{id}`: Retrieve student details by ID.
- `PUT /students/{id}`: Update student details by ID.
- `DELETE /students/{id}`: Delete a student by ID.

**Similar endpoints exist for laptops, courses, books, and addresses.**


# AddressController API Documentation

## Overview

The `AddressController` class provides a set of API endpoints for managing address records within the Model-Based CRUD Operations Portal project. This API allows clients to perform CRUD (Create, Read, Update, Delete) operations on address data. Below, you'll find a summary of the available API endpoints and their usage.

## API Endpoints

1. **Create Address**
   - **Endpoint:** 
   ```
   POST /api/address
   ```
   - **Description:** Allows clients to create a new address record.
   - **Request Body:** JSON object representing the new address.
   - **Response:** A message indicating the successful creation of the address.

2. **Get Address by ID**
   - **Endpoint:** 
   ```
   GET /api/address/{id}
   ```
   - **Description:** Retrieves an address by specifying its unique ID.
   - **Path Variable:** `id` (Long) - The unique identifier of the address.
   - **Response:** Either the retrieved address as JSON or an error message if the address with the given ID was not found.

3. **Update Address by ID**
   - **Endpoint:** 
   ```
   PUT /api/address/id/{id}/addressDetails
   ```
   - **Description:** Allows clients to update an existing address record by providing its unique ID and updated address details.
   - **Path Variable:** `id` (Long) - The unique identifier of the address to be updated.
   - **Request Body:** JSON object representing the updated address details.
   - **Response:** A message indicating that the address data has been updated, or an error message if the address with the given ID was not found.

4. **Delete Address by ID**
   - **Endpoint:** 
   ```
   DELETE /api/address/id/{id}
   ```
   - **Description:** Allows clients to delete an address record by specifying its unique ID.
   - **Path Variable:** `id` (Long) - The unique identifier of the address to be deleted.
   - **Response:** A message indicating that the address data has been deleted, or an error message if the address with the given ID was not found.

5. **Get All Addresses**
   - **Endpoint:** 
   ```
   GET /api/addresss
   ```
   - **Description:** Retrieves a list of all address records stored in the system.
   - **Response:** A JSON array containing all addresses.

To interact with the AddressController API, clients can send HTTP requests to the specified endpoints using tools like Postman or integrate them into their frontend applications. These endpoints allow clients to create, retrieve, update, and delete address records, as well as retrieve a list of all addresses.

# BookController API Documentation

## Overview

The `BookController` class provides a set of API endpoints for managing book records within the Model-Based CRUD Operations Portal project. This API allows clients to perform CRUD (Create, Read, Update, Delete) operations on book data. Below, you'll find a summary of the available API endpoints and their usage.

## API Endpoints

1. **Create Book**
   - **Endpoint:**
   ```
   POST /api/book
   ```
   - **Description:** Allows clients to create a new book record.
   - **Request Body:** JSON object representing the new book.
   - **Response:** A message indicating the successful creation of the book.

2. **Get Book by ID**
   - **Endpoint:** 
   ```
   GET /api/book/{id}
   ```
   - **Description:** Retrieves a book by specifying its unique ID.
   - **Path Variable:** `id` (Long) - The unique identifier of the book.
   - **Response:** Either the retrieved book as JSON or an error message if the book with the given ID was not found.

3. **Update Book by ID**
   - **Endpoint:** 
   ```
   PUT /api/book/id/{id}/bookDetails
   ```
   - **Description:** Allows clients to update an existing book record by providing its unique ID and updated book details.
   - **Path Variable:** `id` (Long) - The unique identifier of the book to be updated.
   - **Request Body:** JSON object representing the updated book details.
   - **Response:** A message indicating that the book data has been updated, or an error message if the book with the given ID was not found.

4. **Delete Book by ID**
   - **Endpoint:** 
   ```
   DELETE /api/book/id/{id}
   ```
   - **Description:** Allows clients to delete a book record by specifying its unique ID.
   - **Path Variable:** `id` (Long) - The unique identifier of the book to be deleted.
   - **Response:** A message indicating that the book data has been deleted, or an error message if the book with the given ID was not found.

5. **Get All Books**
   - **Endpoint:** 
   ```
   GET /api/allBooks
   ```
   - **Description:** Retrieves a list of all book records stored in the system.
   - **Response:** A JSON array containing all books.

To interact with the BookController API, clients can send HTTP requests to the specified endpoints using tools like Postman or integrate them into their frontend applications. These endpoints allow clients to create, retrieve, update, and delete book records, as well as retrieve a list of all books.

# **Similar for all the controller classes
# Usage
To use the Model-Based CRUD Operations Portal, follow these steps:

1. **Run the Application:** Deploy the Spring Boot application on a web server or run it locally.

2. **Database Configuration:** The application is configured to use the MySQL database by default. You can customize the database settings in the application.properties or application.yml file. For production use, consider switching to a different database like H2 or PostgreSQL.

3. **API Endpoints: Response:** Access the application's API endpoints using tools like Postman or by integrating them into your frontend application.

4. **Perform CRUD Operations:** Use the API endpoints to perform CRUD operations on  Model-Based CRUD Operations Portal listings.

5. **Explore Documentation:** Consider generating API documentation using tools like Swagger to provide clear documentation for your API endpoints and their usage.


#### Swagger Configuration
```
http://localhost:8080/swagger-ui/index.html#/
```
## Contact Information

If you have any questions, issues, or need further assistance related to the  Model-Based CRUD Operations Portal project, feel free to contact us. We are here to help!

- **Raj Anand**
  - Email: rajanandxxxx@example.com
  - LinkedIn: [Raj Anand's LinkedIn Profile]()
  - GitHub: [Raj Anand's GitHub Profile]()


Please don't hesitate to reach out if you have any inquiries or need assistance with any aspect of the project. Your feedback and questions are important to us.




