package com.graphql.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.graphql.FeignConfig;
import com.graphql.models.Language;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "configurationClient", url = "${tmdb.apiURL}", path = "/configuration", configuration = FeignConfig.class)
public interface ConfigurationService {

	@RequestMapping(path = "/languages", method = GET)
    List<Language> languages();
}
