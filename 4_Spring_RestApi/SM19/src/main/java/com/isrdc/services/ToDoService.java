package com.isrdc.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.isrdc.dtos.ToDoDto;

@Service
public class ToDoService {
	
	public ToDoDto fetchToDo(Integer id) {
		RestTemplate rt = new RestTemplate();
		
		String url = "https://jsonplaceholder.typicode.com/todos/{id}";
		
		ResponseEntity<ToDoDto> res = rt.getForEntity(url, ToDoDto.class, id);
		
		return res.getBody();
	}
	
	
	public ToDoDto[] collectAllDtos() {
		RestTemplate rt = new RestTemplate();
			
		String url = "https://jsonplaceholder.typicode.com/todos";
		
		ResponseEntity<ToDoDto[]> res = rt.getForEntity(url, ToDoDto[].class);
		
		ToDoDto[] todos = res.getBody();
		
		return todos;
	}
}
