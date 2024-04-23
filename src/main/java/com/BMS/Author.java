package com.BMS;

import java.util.Optional;

public class Author {
    private String name;
    private Optional<String> wikipediaUrl;


    public Author(String name , Optional<String> wikipediaUrl) {
        if(!Policies.fullNamePolicy(name)){
            throw new IllegalArgumentException("Full name is not valid");
        }
        this.name = name;
        this.wikipediaUrl = wikipediaUrl;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getWikipediaUrl() {
        return wikipediaUrl;
    }
}
