package com.peacock.website.frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class WebsitFrontEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsitFrontEndApplication.class, args);
	}
}
