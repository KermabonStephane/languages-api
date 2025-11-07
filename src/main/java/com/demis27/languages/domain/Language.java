package com.demis27.languages.domain;

import lombok.Builder;

@Builder
public record Language(
        String code,
        String englishName,
        String englishNames,
        String frenchNames,
        String iso639_1) {
}
