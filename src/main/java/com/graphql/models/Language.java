package com.graphql.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Language {
	@JsonAlias("iso_639_1")
    private String code;
    @JsonAlias("english_name")
    private String englishName;
    @JsonAlias("name")
    private String name;
}
