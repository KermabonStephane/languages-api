package com.demis27.languages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.demis27.commons.restful.spring", "com.demis27.languages"})
public class LanguagesApplication {
    public static void main(String[] args) {
        SpringApplication.run(LanguagesApplication.class, args);
    }
}