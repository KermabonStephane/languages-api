# Feature Specification: OpenAPI Languages API

**Feature Branch**: `001-openapi-languages-api`
**Created**: 2025-11-05
**Status**: Draft
**Input**: User description: "Create an OpenAPI API that list all languages and a specific one. A language is compose as a English Name of Language;All English Names (list);All French Names (list);ISO 639-2 (three characters code and identifier);ISO 639-1 (two characters code)"

## User Scenarios & Testing *(mandatory)*

### User Story 1 - List all languages (Priority: P1)

As a developer, I want to retrieve a list of all available languages so that I can display them in my application or use them for other purposes. I also want to be able to sort, paginate, and filter the list of languages.

**Why this priority**: This is a core feature of the API.

**Independent Test**: Can be fully tested by making a GET request to the `/languages` endpoint and verifying the response.

**Acceptance Scenarios**:

1. **Given** the API is available, **When** I make a GET request to the `/languages` endpoint, **Then** I should receive a 200 OK response with a JSON array of language objects.
2. **Given** a sort query parameter (e.g., `sort=englishName:asc`), **When** I make a GET request to the `/languages` endpoint, **Then** I should receive a 200 OK response with the languages sorted by the specified field.
3. **Given** pagination values use the HTTP Headers Range, Accept-Range, Content-Range (e.g., `languages 0-9`), **When** I make a GET request to the `/languages` endpoint, **Then** I should receive a 200 OK response with the specified page of languages.
4. **Given** a filter query parameters (e.g., `filters = englishName eq English`), **When** I make a GET request to the `/languages` endpoint, **Then** I should receive a 200 OK response with languages matching the filter.
5. **Given** the sort, pagination and filter use the principes explain in this git repository https://github.com/KermabonStephane/commons-restful like this example https://github.com/KermabonStephane/countries-api and use the library org.demis27::commons-restful::1.3.0 and org.demis27::commons-restful-spring::1.3.0

---

### User Story 2 - Get a specific language (Priority: P1)

As a developer, I want to retrieve the details of a specific language using its ISO 639-1 or ISO 639-2 code, so I can display its information.

**Why this priority**: This is a core feature of the API.

**Independent Test**: Can be tested by making GET requests to the `/languages/{code}` endpoint with various codes and verifying the responses.

**Acceptance Scenarios**:

1. **Given** a valid ISO 639-1 code (e.g., "en"), **When** I make a GET request to `/languages/{code}`, **Then** I should receive a 200 OK response with the corresponding language object.
2. **Given** a valid ISO 639-2 code (e.g., "eng"), **When** I make a GET request to `/languages/{code}`, **Then** I should receive a 200 OK response with the corresponding language object.
3. **Given** an invalid or non-existent code, **When** I make a GET request to `/languages/{code}`, **Then** I should receive a 404 Not Found response.

---

### Edge Cases

- What happens when the database of languages is empty? The API should return an empty list.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: The system MUST provide an OpenAPI specification document (e.g., `openapi.json` or `openapi.yaml`).
- **FR-002**: The system MUST provide a GET endpoint at `/languages` that returns a list of all languages.
- **FR-003**: The system MUST provide a GET endpoint at `/languages/{code}` that returns a single language identified by its ISO 639-1 or ISO 639-2 code.
- **FR-004**: The language object in the API response MUST contain the following fields:
    - `englishName` (string)
    - `englishNames` (array of strings)
    - `frenchNames` (array of strings)
    - `iso639_2` (string)
    - `iso639_1` (string)
- **FR-005**: The `/languages` endpoint MUST support sorting on the `englishName`, `iso639_1`, and `iso639_2` fields.
- **FR-006**: The `/languages` endpoint MUST support pagination using `page` and `limit` query parameters.
- **FR-007**: The `/languages` endpoint MUST support filtering by `englishName`, `iso639_1`, and `iso639_2`.

### Key Entities *(include if feature involves data)*

- **Language**: Represents a human language.
    - `englishName` (string): The primary English name of the language.
    - `englishNames` (array of strings): A list of all English names for the language.
    - `frenchNames` (array of strings): A list of all French names for the language.
    - `iso639_2` (string): The three-letter ISO 639-2 code for the language.
    - `iso639_1` (string): The two-letter ISO 639-1 code for the language.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: Developers can successfully retrieve the full list of languages from the `/languages` endpoint within 500ms.
- **SC-002**: Developers can successfully retrieve a specific language from the `/languages/{code}` endpoint within 200ms.
- **SC-003**: The API documentation is comprehensive enough for a new developer to make their first successful API call within 5 minutes of reading it.
- **SC-004**: The API maintains a 99.9% uptime.
- **SC-005**: Sorting, pagination, and filtering operations on the `/languages` endpoint should not add more than 200ms to the response time.