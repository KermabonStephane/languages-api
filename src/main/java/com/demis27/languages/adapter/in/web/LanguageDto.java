package com.demis27.languages.adapter.in.web;

import lombok.Data;

import java.util.List;

@Data
public class LanguageDto {
    private String englishName;
    private List<String> englishNames;
    private List<String> frenchNames;
    private String iso639_1;
    private String iso639_2;
}
