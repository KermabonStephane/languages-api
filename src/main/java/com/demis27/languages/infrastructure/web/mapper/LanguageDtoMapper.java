package com.demis27.languages.infrastructure.web.mapper;

import com.demis27.languages.domain.Language;
import com.demis27.languages.infrastructure.web.dto.LanguageDto;
import org.mapstruct.Mapper;

@Mapper
public interface LanguageDtoMapper {

    LanguageDto toDto(Language domain);
}
