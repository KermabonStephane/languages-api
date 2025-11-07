package com.demis27.languages.service;

import com.demis27.commons.restful.spring.service.ResourcePort;
import com.demis27.languages.domain.Language;

import java.util.Optional;

public interface LanguagePort extends ResourcePort<Language> {

    Long countLanguage();

    Optional<Language> getLanguage(String code);
}
