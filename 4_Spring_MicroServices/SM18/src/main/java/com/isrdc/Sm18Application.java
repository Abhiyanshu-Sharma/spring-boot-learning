package com.isrdc;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.isrdc.dtos.PostDTO;

@SpringBootApplication
public class Sm18Application {

	public static void main(String[] args) {
		SpringApplication.run(Sm18Application.class, args);
	
//		abc();
		mno();
	}
	
	static void abc() {
		RestTemplate rt = new RestTemplate();
		
		String url = "https://jsonplaceholder.typicode.com/posts/";
		
		ResponseEntity<ArrayList> res = rt.getForEntity(url, ArrayList.class);
		
		ArrayList<PostDTO> postRes = res.getBody();
		
		System.out.println(postRes);
		
		
	}
	
	static void mno() {
		RestTemplate rt = new RestTemplate();
		
		String url = "https://jsonplaceholder.typicode.com/posts/";
		
		ResponseEntity<PostDTO[]> res = rt.getForEntity(url, PostDTO[].class);
		
		PostDTO[] postReps = res.getBody();
		
		for(PostDTO postDto : postReps) {
			System.out.println(postDto);
			System.out.println("###################################");
		}
		
	}

}
