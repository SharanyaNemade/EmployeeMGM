# EmployeeMGM



# 🧑‍💼 Employee Management System

A mini full-stack web application built using **Spring Boot**, **MySQL**, **HTML**, and **Bootstrap** to manage employee records efficiently. This project demonstrates core concepts of CRUD operations, MVC architecture, Spring Data JPA, and RESTful service integration.

---

## 🔧 Tech Stack

| Layer        | Technology        |
|--------------|-------------------|
| Frontend     | HTML5, CSS3, Bootstrap |
| Backend      | Java 17, Spring Boot, Spring MVC, Spring Data JPA |
| Database     | MySQL             |
| Build Tool   | Maven             |
| IDE          | Eclipse           |

---

## 📂 Project Structure


EmployeeMgm
├── src/main/java
│ └── com.employee
│ ├── EmployeeMgmApplication.java # Main Spring Boot app
│ ├── controller
│ │ └── EmployeeController.java # REST + Web controller
│ ├── model
│ │ └── Employee.java # Entity class
│ ├── repo
│ │ └── EmployeeRepository.java # JPA repository interface
│ └── service
│ └── EmployeeService.java # Business logic layer
├── src/main/resources
│ ├── templates # HTML pages (Thymeleaf if used)
│ └── application.properties
├── pom.xml # Project dependencies





---

## 🚀 Features

- Add new employee
- View all employees
- Update employee details
- Delete employee records
- Connected to MySQL using Spring Data JPA
- Clean separation of layers: Controller, Service, Repository

---

## 🛠️ Setup Instructions

### Prerequisites

- Java 17
- Maven
- MySQL
- Eclipse or IntelliJ IDEA

### Steps

1. **Clone the repository**
   git clone https://github.com/your-username/EmployeeMgm.git

2. **Create MySQL Database**
    CREATE DATABASE employee_mgmt;

3. **Configure application.properties**

spring.application.name=EmployeeMgm

spring.datasource.url: jdbc:mysql://localhost:3306/employee
spring.datasource.username: root
spring.datasource.password: 
spring.datasource.driver-class-name: com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto: update
spring.jpa.show-sql: true 


4. **Build and Run**

In Eclipse: Right-click on project → Run As → Spring Boot App

**Or using terminal:**
mvn spring-boot:run


5. **Access Application**

http://localhost:8080/


**📜 License**
This project is open-source and available under the MIT License.

**🤝 Contributions**
Feel free to fork, raise issues, and submit pull requests to enhance the project.


👤 Author
**Sharanya Nemade**
