package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.isrdc.dtos.ToDoDto;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class Sm20Application {

	public static void main(String[] args) {
		SpringApplication.run(Sm20Application.class, args);
		System.out.println("Process Method called ---");
		process();
		System.out.println("Process Method ended ---");
		System.out.println("Info Method called ---");
		info(45);
		System.out.println("Info Method ended ---");
	}
	
	static void info(Integer id) {
		WebClient webClient = WebClient.create();
		
		String url = "https://jsonplaceholder.typicode.com/todos/{id}";
		
		Mono<ToDoDto> mono = webClient.get().uri(url, id).retrieve().bodyToMono(ToDoDto.class);
		
//		Synchronous behavior
		ToDoDto toDo = mono.block();
		
		System.out.println(toDo);
		
		System.out.println("After Response....");
	}
	
	static void process() {
		WebClient webClient = WebClient.create();
		
		String url = "https://jsonplaceholder.typicode.com/todos";
		
		Mono<ToDoDto[]> mono = webClient.get().uri(url).retrieve().bodyToMono(ToDoDto[].class);
		
//		Synchronous behavior
		ToDoDto[] toDo = mono.block();
		
		System.out.println(toDo);
		
		System.out.println("After Response....");
	}
	

}
