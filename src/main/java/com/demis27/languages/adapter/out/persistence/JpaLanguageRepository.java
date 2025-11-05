package com.demis27.languages.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface JpaLanguageRepository extends JpaRepository<LanguagePersistenceEntity, Long>, JpaSpecificationExecutor<LanguagePersistenceEntity> {
    Optional<LanguagePersistenceEntity> findByIso639_1OrIso639_2(String iso639_1, String iso639_2);
}
