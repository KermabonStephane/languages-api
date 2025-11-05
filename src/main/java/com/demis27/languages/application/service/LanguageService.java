package com.demis27.languages.application.service;

import com.demis27.languages.application.port.in.FindLanguageByCodeQuery;
import com.demis27.languages.application.port.in.FindLanguagesQuery;
import com.demis27.languages.application.port.out.LanguageRepository;
import com.demis27.languages.domain.Language;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LanguageService implements FindLanguagesQuery, FindLanguageByCodeQuery {

    private final LanguageRepository languageRepository;

    @Override
    public Page<Language> find(Pageable pageable) {
        return languageRepository.findAll(pageable);
    }

    @Override
    public Optional<Language> findByCode(String code) {
        return languageRepository.findByCode(code);
    }
}
