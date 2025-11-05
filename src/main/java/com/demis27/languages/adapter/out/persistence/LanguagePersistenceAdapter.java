package com.demis27.languages.adapter.out.persistence;

import com.demis27.languages.application.port.out.LanguageRepository;
import com.demis27.languages.domain.Language;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class LanguagePersistenceAdapter implements LanguageRepository {

    private final JpaLanguageRepository jpaLanguageRepository;
    private final LanguagePersistenceMapper mapper;

    @Override
    public Page<Language> findAll(Pageable pageable) {
        return jpaLanguageRepository.findAll(pageable).map(mapper::toDomain);
    }

    @Override
    public Optional<Language> findByCode(String code) {
        return jpaLanguageRepository.findByIso639_1OrIso639_2(code, code).map(mapper::toDomain);
    }
}
