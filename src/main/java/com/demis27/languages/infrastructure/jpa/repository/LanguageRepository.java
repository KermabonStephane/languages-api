package com.demis27.languages.infrastructure.jpa.repository;

import com.demis27.commons.restful.spring.infrastructure.jpa.JpaResourceRepository;
import com.demis27.languages.infrastructure.jpa.entity.LanguageEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaResourceRepository<LanguageEntity, String> {
}
