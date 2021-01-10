package com.graphql.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.graphql.FeignConfig;
import com.graphql.models.GenreResults;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "genreClient", url = "${tmdb.apiURL}", path = "/genre", configuration = FeignConfig.class)
public interface GenreService {

	@RequestMapping(path = "/movie/list", method = GET)
    GenreResults movieGenreList();

}
