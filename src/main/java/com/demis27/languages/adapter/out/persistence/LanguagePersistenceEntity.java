package com.demis27.languages.adapter.out.persistence;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "language")
@Data
public class LanguagePersistenceEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String englishName;

    @ElementCollection
    private List<String> englishNames;

    @ElementCollection
    private List<String> frenchNames;

    private String iso639_1;
    private String iso639_2;
}
