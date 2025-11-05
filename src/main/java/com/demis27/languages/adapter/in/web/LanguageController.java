package com.demis27.languages.adapter.in.web;

import com.demis27.languages.application.port.in.FindLanguageByCodeQuery;
import com.demis27.languages.application.port.in.FindLanguagesQuery;
import com.demis27.languages.domain.Language;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/languages")
@RequiredArgsConstructor
@Tag(name = "Languages", description = "API for managing languages")
public class LanguageController {

    private final FindLanguagesQuery findLanguagesQuery;
    private final FindLanguageByCodeQuery findLanguageByCodeQuery;
    private final LanguageMapper languageMapper;

    @Operation(summary = "Get all languages")
    @GetMapping
    public Page<LanguageDto> getLanguages(Pageable pageable) {
        return findLanguagesQuery.find(pageable).map(languageMapper::toDto);
    }

    @Operation(summary = "Get a language by code")
    @GetMapping("/{code}")
    public ResponseEntity<LanguageDto> getLanguageByCode(@PathVariable String code) {
        return findLanguageByCodeQuery.findByCode(code)
                .map(languageMapper::toDto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
