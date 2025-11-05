# Data Model

## Language

Represents a human language.

### Fields

| Name | Type | Description | Constraints |
|---|---|---|---|
| englishName | string | The primary English name of the language. | Mandatory |
| englishNames | array of strings | A list of all English names for the language. | |
| frenchNames | array of strings | A list of all French names for the language. | |
| iso639_2 | string | The three-letter ISO 639-2 code for the language. | Mandatory, 3 characters |
| iso639_1 | string | The two-letter ISO 639-1 code for the language. | Mandatory, 2 characters |

### Example

```json
{
  "englishName": "English",
  "englishNames": ["English"],
  "frenchNames": ["Anglais"],
  "iso639_2": "eng",
  "iso639_1": "en"
}
```
