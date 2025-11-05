package com.demis27.languages.application.port.in;

import com.demis27.languages.domain.Language;

import java.util.Optional;

public interface FindLanguageByCodeQuery {
    Optional<Language> findByCode(String code);
}
