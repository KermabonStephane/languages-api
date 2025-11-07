package com.demis27.languages.infrastructure.web.dto;

public record LanguageDto(
        String code,
        String englishName,
        String englishNames,
        String frenchNames,
        String iso639_1) {
}
