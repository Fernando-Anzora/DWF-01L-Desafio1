# DWF-01L-Desafio1
DWF practical Challenge 1 of the laboratory group 01L, in pairs
This project is a REST API developed with **Spring Boot** for book management. It allows you to register, consult, update and delete books.

## 🛠 Technologies Used
Used Spring Boot Dependencies: 
**Spring Web**
**Spring Data JPA**
**H2 Database**
**Lombok**
**Spring Boot DevTools**
Front-End frameworks:
**HTML5 + JavaScript**
**Tailwind CSS**
**Font Awesome**
**SweetAlert2**

Structure of the project
bookapi/
├── src/
├── pom.xml
├── README.md
├── frontend/

## 📋 How to execute correctly

👾 Step 1:
Open the project in Intellij IDEA

🎆 Method 1:

From the Terminal we execute: .\mvnw spring-boot: run or mvn spring-boot: run

From the H2 console 
http://localhost:8080/h2-console
The parameters 
JDBC URL: jdbc: h2:mem: booksdb
User: sa
Password:(empty)

🎆 Method 2:

Run the BookapiApplication file.java from Intellij IDEA visual environment

👾 Step 2:

🎆 Method 1:
From the browser go to the url: http://localhost:8080/index.html

🎆 Method 2:

From the CMD terminal
curl http://localhost:8080/api/books
