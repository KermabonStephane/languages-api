package com.demis27.languages.domain;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Language {
    private Long id;
    private String englishName;
    private List<String> englishNames;
    private List<String> frenchNames;
    private String iso639_1;
    private String iso639_2;
}
