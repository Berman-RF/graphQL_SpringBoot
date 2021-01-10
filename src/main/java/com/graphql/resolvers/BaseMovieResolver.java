package com.graphql.resolvers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.models.BaseMovie;
import com.graphql.models.Genre;
import com.graphql.service.CommonCodeService;

@Component
public class BaseMovieResolver implements GraphQLResolver<BaseMovie> {
	
	@Autowired
    protected CommonCodeService commonCodeService;

	 public List<Genre> getGenres(BaseMovie movie) {
	        
	        List<Genre> genresList = new ArrayList<Genre>();
	        for(Integer id : movie.getGenrIds())
	        {
	        	genresList.add(commonCodeService.getMovieGenreById(id));
	        }
	        return genresList;
	    }
}
