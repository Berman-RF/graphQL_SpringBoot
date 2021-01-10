package com.graphql.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {
	 private Integer id;
	    private String name;
	    @JsonAlias("origin_country")
	    private String originCountry;
}
