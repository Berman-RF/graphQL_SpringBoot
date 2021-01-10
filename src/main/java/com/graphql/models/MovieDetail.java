package com.graphql.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDetail extends BaseMovie{
	
	private List<Genre> genres;
	private String homepage;
	private Integer runtime;
	@JsonAlias("spoken_languages")
	private List<Language> spokenLanguages;
	@JsonAlias("production_countries")
    private List<Country> productionCountries;
	@JsonAlias("production_companies")
    private List<Company> productionCompanies;
	private Double popularity;
	@JsonAlias("vote_average")
    private Double voteAverage;
    @JsonAlias("vote_count")
    private Integer voteCount;
	
	
}
