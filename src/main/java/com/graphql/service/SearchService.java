package com.graphql.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.graphql.FeignConfig;
import com.graphql.models.MoviePageResults;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "searchClient", url = "${tmdb.apiURL}", path = "/search", configuration = FeignConfig.class)
public interface SearchService {

	@RequestMapping(path = "/movie", method = GET)
    MoviePageResults searchMovie(@RequestParam(name = "query") String query, @RequestParam(name = "page", defaultValue = "1") Integer page);
}
