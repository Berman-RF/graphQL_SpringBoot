package com.graphql.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
	@JsonAlias("iso_3166_1")
    private String code;
    @JsonAlias({"name", "english_name"})
    private String name;
}
