# Book Management System (BMS)

## Overview

The Book Management System (BMS) is a simple Java-based application designed to manage a collection of books in a library. It provides functionalities to add books, loan books, return books, and display books based on their availability status.

## Features

- **Add Book**: Add a new book to the library.
- **Loan Book**: Loan out a book from the library.
- **Return Book**: Return a loaned book to the library.
- **Display Books**: Display available and loaned out books.

## Current State

The current version of the BMS is a console-based Java application. It includes the following components:

- **Book Class**: Represents a book with attributes such as ISBN, author, title, and status.
- **Author Class**: Represents an author with a name attribute.
- **BookRepository Class**: Manages the collection of available and loaned books.
- **LibraryManagementSystem Class**: Manages the display of books based on their availability status.
- **Policies Class**: Contains utility methods for validation:
   - **isbnPolicy**: Validates ISBNs based on length, hyphens, and character patterns.
   - **fullNamePolicy**: Validates full names by checking for at least two words and alphabetic characters.

## Future Plans

I plan to enhance the BMS by developing it into a Spring application with a React-based interface. Here's what we aim to achieve:

- **Spring Integration**: Integrate the BMS with the Spring framework to build a robust and scalable backend.
- **React Frontend**: Develop a React-based interface to provide a user-friendly and interactive frontend for the BMS.
- **RESTful APIs**: Implement RESTful APIs using Spring to facilitate communication between the frontend and backend.
- **Database Integration**: Integrate a database (e.g., MySQL, PostgreSQL) with Spring to persist book and author data.
- **User Authentication**: Implement user authentication and authorization using Spring Security to secure the BMS.

## Getting Started

To run the current version of the BMS:

1. Clone the repository:
    ```
   git@github.com:Mspeaker72/BMS.git
    ```

2. Navigate to the project directory:
    ```
    cd LibraryMangementSystem
    ```

3. Compile and run the program:
    ```
    JAR will be packaged
    ```

## Contributing

We welcome contributions! If you have any suggestions or would like to contribute to the BMS, please feel free to fork the repository and submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
