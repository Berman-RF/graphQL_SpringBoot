package com.graphql.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MoviePageResults {

	private Integer page;
    @JsonAlias("total_pages")
    private Integer totalPages;
    @JsonAlias("total_results")
    private Integer totalResults;
    private List<BaseMovie> results;
}
