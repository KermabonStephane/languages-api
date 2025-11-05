package com.demis27.languages.application.port.in;

import com.demis27.languages.domain.Language;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface FindLanguagesQuery {
    Page<Language> find(Pageable pageable);
}
