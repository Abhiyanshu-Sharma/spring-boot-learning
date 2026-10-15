package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.isrdc.dtos.PostDTO;

@SpringBootApplication
public class Sm17Application {

	public static void main(String[] args) {
		SpringApplication.run(Sm17Application.class, args);
		
		abc();
	}
	
	static void abc() {
		RestTemplate rt = new RestTemplate();
		
		String url = "https://jsonplaceholder.typicode.com/posts/12";
		
		ResponseEntity<PostDTO> res = rt.getForEntity(url, PostDTO.class);
		
		PostDTO postDto = res.getBody();
		
		System.out.println(postDto);
	}

}
