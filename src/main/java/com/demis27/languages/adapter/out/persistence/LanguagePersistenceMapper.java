package com.demis27.languages.adapter.out.persistence;

import com.demis27.languages.domain.Language;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LanguagePersistenceMapper {
    Language toDomain(LanguagePersistenceEntity entity);
    LanguagePersistenceEntity toEntity(Language domain);
}
