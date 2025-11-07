package com.demis27.languages.service;

import com.demis27.commons.restful.spring.service.ResourcePort;
import com.demis27.commons.restful.spring.service.ResourceService;
import com.demis27.languages.domain.Language;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LanguageService extends ResourceService<Language> {
    protected LanguageService(ResourcePort<Language> support) {
        super(support);
    }

    public Optional<Language> getLanguage(String languageCode) {
        return ((LanguagePort)support).getLanguage(languageCode);
    }
}
