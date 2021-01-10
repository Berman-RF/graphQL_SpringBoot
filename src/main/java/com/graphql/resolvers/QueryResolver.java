package com.graphql.resolvers;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.models.MovieDetail;
import com.graphql.models.MoviePageResults;
import com.graphql.service.MovieService;
import com.graphql.service.SearchService;

@Component
public class QueryResolver implements GraphQLQueryResolver {

	private final MovieService movieService;
	private final SearchService searchService;
	
	public QueryResolver(MovieService movieService, SearchService searchService) {
		this.movieService = movieService;
		this.searchService = searchService;
	}
	
	public MoviePageResults popularMovies(Integer page) {
		return movieService.popularMovies(page);
	}
	
	public MovieDetail movieDetail(long id) {
		return movieService.getMovieDetail(id);
	}
	
	public MoviePageResults searchMovie(String query, Integer page) {
        
        return searchService.searchMovie(query, page);
    }
}
