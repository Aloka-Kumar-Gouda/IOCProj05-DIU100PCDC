🔹 Project Overview

This application is a simple Spring Core project built using annotation-based configuration instead of XML. It explains how the IoC container manages bean creation and performs setter-based dependency injection in a clean and maintainable way.

The main objective of this project is to understand how Spring handles dependency resolution and bean wiring using pure code-driven configuration.

🔹 Architecture Explanation

The AppConfig class is annotated with @Configuration and @ComponentScan, which enables component scanning and registers beans inside the IoC container. It defines a LocalDate bean using the @Bean annotation.

The WeekDayAnalyzer class is marked with @Component and uses setter injection with @Autowired to receive the LocalDate dependency from the container.

The main class loads the IoC container using AnnotationConfigApplicationContext and retrieves the target bean to execute business logic.

🔹 Key Concepts Covered

This project demonstrates:

Inversion of Control (IoC)

Annotation-based configuration

Setter Injection

Bean lifecycle management

Java-based configuration approach

🔹 Interview Perspective

This project clearly shows understanding of Spring Core fundamentals, dependency injection types, and annotation-driven configuration. It reflects knowledge of how the IoC container works internally and how beans are created and wired without XML configuration.

👨‍💻 Author

Aloka Kumar Gouda
