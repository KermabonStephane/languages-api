package com.demis27.languages.adapter.in.web;

import com.demis27.languages.domain.Language;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LanguageMapper {
    LanguageDto toDto(Language language);
}
