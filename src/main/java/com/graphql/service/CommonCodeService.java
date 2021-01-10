package com.graphql.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.graphql.models.Genre;
import com.graphql.models.Language;

@Component
public class CommonCodeService {

	private final ConfigurationService configurationService;
	private final GenreService genreService;
	private List<Language> languages;
	private List<Genre> movieGenreList;

	public CommonCodeService(ConfigurationService configurationService, GenreService genreService) {
		super();
		this.configurationService = configurationService;
		this.genreService = genreService;
	}

	public Language getLanguageByCode(String code) {

		for(Language language : this.languages) 
		{
			if(language.getCode().equalsIgnoreCase(code))
			{
				return language;
			}
		}
		return null;
	}

	public Genre getMovieGenreById(Integer id) {

		for(Genre genre : this.movieGenreList)
		{
			if(genre.getId().equals(id))
			{
				return genre;
			}
		}
		return null;
	}

	public List<Language> getLanguages() {
		return this.languages;
	}

	@PostConstruct
	private void loadData() {
		this.languages = configurationService.languages();
		this.movieGenreList = genreService.movieGenreList().getGenres();
	}
}
