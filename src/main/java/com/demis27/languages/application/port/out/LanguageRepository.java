package com.demis27.languages.application.port.out;

import com.demis27.languages.domain.Language;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.Optional;

public interface LanguageRepository {
    Page<Language> findAll(Pageable pageable);
    Optional<Language> findByCode(String code);
}
