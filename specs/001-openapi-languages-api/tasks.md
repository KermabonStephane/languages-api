# Tasks: OpenAPI Languages API

**Input**: Design documents from `/specs/001-openapi-languages-api/`
**Prerequisites**: plan.md (required), spec.md (required for user stories), data-model.md, contracts/

## Phase 1: Setup (Shared Infrastructure)

**Purpose**: Project initialization and basic structure

- [X] T001 Initialize Maven project with Java 21 and Spring Boot.
- [X] T002 Add dependencies for Spring Boot, Spock, ArchUnit, OpenAPI, Liquibase, Lombok, MapStruct, and PostgreSQL driver to `pom.xml`.
- [X] T003 Configure `application.properties` for database connection.
- [X] T004 Create project structure as per `plan.md`.

---

## Phase 2: Foundational (Blocking Prerequisites)

**Purpose**: Core infrastructure that MUST be complete before ANY user story can be implemented

- [X] T005 Create Liquibase changelog file for the `language` table in `src/main/resources/db/changelog/`.
- [X] T006 Define the `language` table schema in the Liquibase changelog.
- [X] T007 Create `Language` entity in `src/main/java/com/demis27/languages/domain/`.
- [X] T008 Create `LanguageRepository` interface in `src/main/java/com/demis27/languages/application/port/out/`.

---

## Phase 3: User Story 1 - List all languages (Priority: P1) 🎯 MVP

**Goal**: Retrieve a list of all available languages with sorting, pagination, and filtering.

**Independent Test**: Can be fully tested by making GET requests to the `/languages` endpoint with various parameters and verifying the response.

### Implementation for User Story 1

- [X] T009 [P] [US1] Create `LanguageDto` in `src/main/java/com/demis27/languages/adapter/in/web/`.
- [X] T010 [P] [US1] Create `LanguageMapper` interface with MapStruct in `src/main/java/com/demis27/languages/adapter/in/web/`.
- [X] T011 [US1] Create `FindLanguagesQuery` in `src/main/java/com/demis27/languages/application/port/in/`.
- [X] T012 [US1] Create `LanguageService` in `src/main/java/com/demis27/languages/application/service/` to implement `FindLanguagesQuery`.
- [X] T013 [US1] Implement sorting, pagination, and filtering logic in `LanguageService`.
- [X] T014 [US1] Create `LanguageController` in `src/main/java/com/demis27/languages/adapter/in/web/` with a GET endpoint for `/languages`.
- [X] T015 [US1] Write unit tests for `LanguageService` in `src/test/groovy/com/demis27/languages/application/service/`.
- [X] T016 [US1] Write integration tests for `LanguageController` in `src/test/groovy/com/demis27/languages/adapter/in/web/`.

---

## Phase 4: User Story 2 - Get a specific language (Priority: P1)

**Goal**: Retrieve the details of a specific language using its ISO 639-1 or ISO 639-2 code.

**Independent Test**: Can be tested by making GET requests to the `/languages/{code}` endpoint with various codes and verifying the responses.

### Implementation for User Story 2

- [X] T017 [US2] Create `FindLanguageByCodeQuery` in `src/main/java/com/demis27/languages/application/port/in/`.
- [X] T018 [US2] Update `LanguageService` to implement `FindLanguageByCodeQuery`.
- [X] T019 [US2] Add a GET endpoint for `/languages/{code}` to `LanguageController`.
- [X] T020 [US2] Write unit tests for the new functionality in `LanguageService`.
- [X] T021 [US2] Write integration tests for the new endpoint in `LanguageController`.

---

## Phase 5: Polish & Cross-Cutting Concerns

**Purpose**: Improvements that affect multiple user stories

- [X] T022 Configure ArchUnit tests in `src/test/groovy/com/demis27/languages/`.
- [X] T023 Add OpenAPI documentation to the controllers.
- [X] T024 Code cleanup and refactoring.

---

## Dependencies & Execution Order

- **User Story 1 (P1)**: Can start after Foundational (Phase 2).
- **User Story 2 (P2)**: Can start after Foundational (Phase 2).

### Parallel Opportunities

- User Stories 1 and 2 can be implemented in parallel.
- Within each user story, tasks marked with `[P]` can be implemented in parallel.
