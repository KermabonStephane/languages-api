package com.demis27.languages.infrastructure.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "language")
public class LanguageEntity {

    @Id
    @Column(name = "code_3c")
    private String code;

    @Column(name = "english_name")
    private String englishName;

    @Column(name = "english_names")
    private String englishNames;

    @Column(name = "french_names")
    private String frenchNames;

    @Column(name = "code_2c")
    private String iso639_1;
}
