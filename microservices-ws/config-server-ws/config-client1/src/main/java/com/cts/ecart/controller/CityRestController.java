package com.cts.ecart.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/city")
@RefreshScope
public class CityRestController {

	
	@Value("${name}")
	private String cityName;
	
	
	@GetMapping
	public String getName() {
		return "City name is  "+cityName;
	}
	
	
	

}
