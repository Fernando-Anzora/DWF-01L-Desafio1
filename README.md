# DWF-01L-Desafio1
Desafío practico 1 de DWF del grupo de laboratorio 01L, en parejas
Este proyecto es una API REST desarrollada con **Spring Boot** para la gestión de libros. Permite registrar, consultar, actualizar y eliminar libros.

Dependencias Utilizadas de Spring Boot utilizadas 
**Spring Web**
**Spring Data JPA**
**H2 Database**
**Lombok**
**Spring Boot DevTools**

Estructura del proyecto
bookapi/
├── src/
├── pom.xml
├── README.md
├── frontend/

Como ejecutar de manera correcta

Desde la Terminal de Intellij IDEA 

Ejecutamos: .\mvnw spring-boot:run o mvn spring-boot:run

Desde la consola H2 
http://localhost:8080/h2-console
Los parametros 
JDBC URL: jdbc:h2:mem:booksdb
Usuario:sa
Contraseña:(vacío)

Desde HTML
http://localhost:8080/index.html

Desde la terminal CMD
curl http://localhost:8080/api/books
