package com.graphql;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;
import feign.RequestTemplate;


@Configuration
public class FeignConfig {
	@Value("${tmdb.apiKey}")
	private String apiKey;

	@Bean
	public RequestInterceptor apiKeyInterceptor() {
		RequestInterceptor requestTemplate = new RequestInterceptor() {

			@Override
			public void apply(RequestTemplate template) {
				template.query(Constant.PARAM_API_KEY, apiKey);

			}
		};
		return requestTemplate;
	}
}
