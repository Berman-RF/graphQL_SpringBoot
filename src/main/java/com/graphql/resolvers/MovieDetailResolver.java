package com.graphql.resolvers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.models.Language;
import com.graphql.models.MovieDetail;
import com.graphql.service.CommonCodeService;

@Component
public class MovieDetailResolver implements GraphQLResolver<MovieDetail>{

	@Autowired
    protected CommonCodeService commonCodeService;
	
	public List<Language> getSpokenLanguages(MovieDetail movie) {
		
        List<Language> langList = new ArrayList<Language>();
        for(Language language : movie.getSpokenLanguages()) {
        	langList.add(commonCodeService.getLanguageByCode(language.getCode()));
        }
        return langList;
    }
}
