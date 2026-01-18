🎓 Alumni Connect (altEnter)

Alumni Connect (altEnter) is a Spring Boot–based web application designed to bridge the gap between alumni and current students by providing a secure and interactive platform for networking, communication, and collaboration.

🚀 Features

🔐 Secure Authentication & Authorization

Implemented using Spring Security

Role-based access for users (Alumni / Students / Admin)

🧑‍🤝‍🧑 User Management

User registration and login

Profile management for alumni and students

🗂️ Database Integration

Uses MySQL with Spring Data JPA for data persistence

Entity–relationship mapping with Hibernate

🎨 Server-Side Rendering

Dynamic UI using Thymeleaf

Thymeleaf–Spring Security integration for role-based views

✅ Input Validation

Implemented using Spring Validation

Prevents invalid and malicious inputs

🧪 Testing

Unit and integration testing with JUnit 5

Database testing using Testcontainers (MySQL)

🛠️ Tech Stack

Language: Java 21

Framework: Spring Boot 3.5.5

Security: Spring Security, Thymeleaf Security Extras

Database: MySQL

ORM: Spring Data JPA (Hibernate)

Frontend: Thymeleaf

Build Tool: Maven

Testing: JUnit 5, Spring Boot Test, Testcontainers

Utilities: Lombok

📂 Project Structure
altEnter
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.alumniConnect.altEnter
│   │   │       ├── controller
│   │   │       ├── service
│   │   │       ├── repository
│   │   │       ├── model
│   │   │       └── security
│   │   └── resources
│   │       ├── templates
│   │       └── application.yml
│   └── test
│       └── java
└── pom.xml

⚙️ Configuration
Database Configuration (application.yml or application.properties)
spring.datasource.url=jdbc:mysql://localhost:3306/alumni_connect
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

▶️ Running the Application
Prerequisites

Java 21

Maven

MySQL

Steps
git clone https://github.com/your-username/altEnter.git
cd altEnter
mvn clean install
mvn spring-boot:run


Access the application at:

http://localhost:8080

🧪 Running Tests
mvn test


Testcontainers automatically spins up a MySQL container for integration testing.

🎯 Future Enhancements

💬 Alumni–Student messaging system

📢 Job and internship posting module

🔍 Advanced alumni search and filters

📅 Event and meetup management

🌐 REST API support for mobile apps

👨‍💻 Author

Hariom Mishra
Java & Spring Boot Developer

📄 License

This project is developed for learning and educational purposes.

🔥 If you want:

A shorter README

A backend-only README

A resume description

A LinkedIn project description

Just tell me 👍

its only alumniconnect ot alt enter

Got it 👍 — thanks for clarifying.

Here is the corrected README.md, using only AlumniConnect (no altEnter anywhere).

You can directly copy-paste this into your repo.

🎓 AlumniConnect

AlumniConnect is a Spring Boot–based web application designed to connect alumni and students through a secure, structured, and scalable platform. The application focuses on authentication, role-based access, and reliable data management using modern Java and Spring technologies.

🚀 Features

🔐 Authentication & Authorization

Secure login and registration using Spring Security

Role-based access control (Alumni / Student / Admin)

🧑‍🤝‍🧑 User Management

Alumni and student profile management

Secure session handling

🗂️ Database Integration

MySQL integration using Spring Data JPA

ORM mapping with Hibernate

🎨 Server-Side Rendering

Dynamic UI built with Thymeleaf

Thymeleaf–Spring Security integration for conditional rendering

✅ Validation & Error Handling

Input validation using Spring Validation

Prevents invalid and unsafe user inputs

🧪 Testing

Unit and integration tests using JUnit 5

Database testing with Testcontainers (MySQL)

🛠️ Tech Stack

Language: Java 21

Framework: Spring Boot 3.5.5

Security: Spring Security, Thymeleaf Security Extras

Database: MySQL

ORM: Spring Data JPA (Hibernate)

Frontend: Thymeleaf

Build Tool: Maven

Testing: JUnit 5, Spring Boot Test, Testcontainers

Utilities: Lombok

📂 Project Structure
AlumniConnect
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.alumniConnect
│   │   │       ├── controller
│   │   │       ├── service
│   │   │       ├── repository
│   │   │       ├── model
│   │   │       └── security
│   │   └── resources
│   │       ├── templates
│   │       └── application.yml
│   └── test
│       └── java
└── pom.xml

⚙️ Configuration
Database Configuration (application.properties)
spring.datasource.url=jdbc:mysql://localhost:3306/alumniconnect
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

▶️ Running the Application
Prerequisites

Java 21

Maven

MySQL

Steps
git clone https://github.com/your-username/AlumniConnect.git
cd AlumniConnect
mvn clean install
mvn spring-boot:run


Access the application at:

http://localhost:8080

🧪 Running Tests
mvn test


Testcontainers automatically starts a MySQL container for integration testing.

🎯 Future Enhancements

💬 Alumni–Student messaging system

📢 Job and internship postings

🔍 Advanced alumni search

📅 Events and meetups

🌐 REST APIs for mobile integration

👨‍💻 Author

Hariom Mishra
Java & Spring Boot Developer

📄 License

This project is developed for educational and learning purposes.
