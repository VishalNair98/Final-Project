package com.cg.devops;

import org.json.simple.parser.JSONParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author Team1
 * @viewedBy Amit Kumar
 * Configurations required for the Application
 *
 */
@Configuration
public class AppConfig {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	@Scope(scopeName = "")
	public JSONParser getJsonParser() {
		return new JSONParser();
	}
}
