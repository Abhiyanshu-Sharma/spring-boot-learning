package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Sm16Application {

	public static void main(String[] args) {
		SpringApplication.run(Sm16Application.class, args);
		
		abc();
	}

	static void abc() {
		RestTemplate rt = new RestTemplate();
		
		String apiURL = "https://jsonplaceholder.typicode.com/posts/1";
		
		ResponseEntity<String> response = rt.getForEntity(apiURL, String.class);
		
		System.out.println(response.getBody());
	}
}
