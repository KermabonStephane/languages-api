# Quickstart

This document provides a quick guide to getting the Languages API project up and running.

## Prerequisites

- Java 21
- Maven
- Docker
- Docker Compose

## Running the application

1.  **Clone the repository:**

    ```bash
    git clone <repository-url>
    cd languages-api
    ```

2.  **Build the application:**

    ```bash
    mvn clean install
    ```

3.  **Run the application:**

    ```bash
    docker-compose up
    ```

The API will be available at `http://localhost:8080`.

## API Documentation

The OpenAPI documentation is available at `http://localhost:8080/swagger-ui.html`.
