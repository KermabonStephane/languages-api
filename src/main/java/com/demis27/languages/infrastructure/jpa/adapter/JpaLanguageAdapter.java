package com.demis27.languages.infrastructure.jpa.adapter;

import com.demis27.commons.restful.spring.infrastructure.jpa.EntityMapper;
import com.demis27.commons.restful.spring.infrastructure.jpa.JpaResourceAdapter;
import com.demis27.commons.restful.spring.infrastructure.jpa.JpaResourceRepository;
import com.demis27.languages.domain.Language;
import com.demis27.languages.infrastructure.jpa.entity.LanguageEntity;
import com.demis27.languages.service.LanguagePort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JpaLanguageAdapter extends JpaResourceAdapter<Language, LanguageEntity, String> implements LanguagePort {

    protected JpaLanguageAdapter(JpaResourceRepository<LanguageEntity, String> repository, EntityMapper<LanguageEntity, Language> mapper) {
        super(repository, mapper);
    }

    @Override
    public Long countLanguage() {
        return repository.count();
    }

    @Override
    public Optional<Language> getLanguage(String code) {
        return repository.findById(code).map(mapper::toDomain);
    }
}
