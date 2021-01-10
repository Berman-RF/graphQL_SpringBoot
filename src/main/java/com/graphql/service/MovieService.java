package com.graphql.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.graphql.FeignConfig;
import com.graphql.models.MovieDetail;
import com.graphql.models.MoviePageResults;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "movieClient", url = "${tmdb.apiURL}", path = "/movie", configuration = FeignConfig.class)
public interface MovieService {
	
    @RequestMapping(path = "/popular", method = GET)
    MoviePageResults popularMovies(@RequestParam(name = "page", defaultValue = "1") Integer page);
    
    @RequestMapping(path = "/{id}", method = GET)
    MovieDetail getMovieDetail(@PathVariable("id") Long id);
}
