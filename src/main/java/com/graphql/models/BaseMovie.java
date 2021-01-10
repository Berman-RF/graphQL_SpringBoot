package com.graphql.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseMovie {
	private long id;
	private String title;
	@JsonAlias("release_date")
	private String releaseDate;
	private String overview;
	@JsonAlias("genre_ids")
	private List<Integer> genrIds;
}
