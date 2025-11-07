package com.demis27.languages.infrastructure.jpa.mapper;

import com.demis27.languages.domain.Language;
import com.demis27.languages.infrastructure.jpa.entity.LanguageEntity;
import org.mapstruct.Mapper;

@Mapper
public interface LanguageEntityMapper {

    Language toDomain(LanguageEntity entity);
}
