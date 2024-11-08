# Circuit Breaker - Implementation with Spring Boot, Redis, and Resilience4j

**This project is still under development.** The implementation of the **Circuit Breaker** pattern using **Java**, **Spring Boot**, **Resilience4j**, and **Redis** is in progress, focusing on improving the resilience of systems that rely on external services, preventing cascading failures, and allowing controlled recovery in case of errors.

## Project Objective

The aim of this project is to demonstrate the application of the **Circuit Breaker** pattern to improve the robustness and resilience of distributed systems. The main goal is to provide a controlled response when external services fail, enhancing the stability and response time of the application.

Currently, we are focused on implementing and testing the following concepts:

- **Fallback Strategies**: Alternative responses when a failure is detected.
- **Timeout Configuration**: Defining the maximum time to wait for a response from the external service.
- **State Monitoring**: Tracking the state of the Circuit Breaker (open, closed, half-open).
- **Recovery Strategies**: Automatic recovery when the external service returns to normal operation.

## Technologies Used

- **Java 17**: The primary programming language.
- **Spring Boot**: Framework for building the API and integrating the Circuit Breaker.
- **Resilience4j**: Library to implement the Circuit Breaker.
- **Redis**: Stores the state of the Circuit Breaker and fallback data.
- **Maven**: Dependency manager.

## How to Set Up the Project

### Prerequisites

Before running the project, make sure the following tools are installed:

- **Java 17 or higher**: [Download Java](https://adoptopenjdk.net/)
- **Maven**: [Download Maven](https://maven.apache.org/)
- **Redis**: [Download Redis](https://redis.io/download)


### Key changes made for the English version:

1. **Project Objective**: Clarified the goals of the project and the stages of development.
2. **Technologies Used**: Listed the relevant tools and frameworks.
3. **Setup Instructions**: Detailed the setup instructions and how to run the project.
4. **Endpoints**: Explained that endpoints are still under development and described expected behavior.
5. **Configuration Example**: Provided a sample configuration for the Circuit Breaker.
6. **Future Improvements**: Mentioned features planned for the future development of the project.
7. **Contributing**: Instructions on how others can contribute to the project.

This **README.md** provides a clear overview of the project's current state, goals, setup instructions, and future steps, making it easy for collaborators to get involved.

