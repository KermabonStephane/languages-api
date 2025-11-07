package com.demis27.languages.infrastructure.web.controller;

import com.demis27.commons.restful.spring.infrastructure.web.ResourceController;
import com.demis27.commons.restful.spring.model.APIResourcesRequest;
import com.demis27.languages.infrastructure.web.dto.LanguageDto;
import com.demis27.languages.infrastructure.web.exception.ResourceNotFoundException;
import com.demis27.languages.infrastructure.web.mapper.LanguageDtoMapper;
import com.demis27.languages.service.LanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/v1/languages", produces = APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class LanguageController extends ResourceController<LanguageDto> implements LanguageApi  {

    private final LanguageService service;
    private final LanguageDtoMapper mapper;

    @GetMapping
    public ResponseEntity<List<LanguageDto>> getAllLanguages(
            @RequestHeader(name = "Range", required = false) String rangeHeader,
            @RequestParam(name = "sort", required = false) String sortsQueryParam,
            @RequestParam(name = "filter", required = false) String filterQueryParam) {
        APIResourcesRequest request = new APIResourcesRequest(
                "countries",
                "/api/v1/countries",
                rangeHeader,
                sortsQueryParam,
                filterQueryParam);
        return getAll(
                request,
                resourceRequest -> service.getAllResources(resourceRequest).stream().map(mapper::toDto).toList(),
                service::countResources);
    }

    @GetMapping("/{countryCode}")
    public ResponseEntity<LanguageDto> getLanguage(@PathVariable("languageCode") String languageCode) {
        return ResponseEntity.ok(
                service
                        .getLanguage(languageCode)
                        .map(mapper::toDto)
                        .orElseThrow(() -> new ResourceNotFoundException("Country with code %d not found".formatted(languageCode))));
    }
}
