# Research & Decisions

## Technology Stack

- **Decision**: The project will be built using Java 21 and the Spring Boot framework.
- **Rationale**: This is a modern and robust stack for building web applications. The user has explicitly requested this stack.
- **Alternatives considered**: None, as the stack was specified by the user.

## Testing

- **Decision**: Testing will be done using the Spock Framework for unit and integration tests, and ArchUnit for testing architectural constraints.
- **Rationale**: Spock provides a highly readable and expressive syntax for writing tests. ArchUnit ensures that the codebase adheres to the defined architectural rules.
- **Alternatives considered**: JUnit, TestNG. Spock was chosen for its superior readability.

## Database

- **Decision**: PostgreSQL will be used as the database. Liquibase will be used for database migrations.
- **Rationale**: PostgreSQL is a powerful and reliable open-source relational database. Liquibase provides a robust way to manage database schema changes.
- **Alternatives considered**: MySQL, MariaDB. PostgreSQL was chosen for its advanced features and strong community support.

## API Documentation

- **Decision**: The API will be documented using the OpenAPI specification.
- **Rationale**: OpenAPI is the industry standard for documenting RESTful APIs. It provides a machine-readable format that can be used to generate client libraries, documentation, and more.
- **Alternatives considered**: RAML, API Blueprint. OpenAPI was chosen for its widespread adoption and rich ecosystem of tools.
