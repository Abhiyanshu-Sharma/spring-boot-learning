package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.isrdc.dtos.ToDoDto;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class Sm21Application {

	public static void main(String[] args) {
		SpringApplication.run(Sm21Application.class, args);
		process();
	}
	
	static void process() {
		WebClient webClient = WebClient.create();
		
		String url = "https://jsonplaceholder.typicode.com/todos/39";
		
//		Asynchronous behavior
		webClient.get().uri(url).retrieve().bodyToMono(ToDoDto.class).subscribe(res -> {
			handleRes(res);
		});
		
		System.out.println("This line will run first... then response will be diplayed...");

	}
	
	static void handleRes(ToDoDto res) {
		System.out.println(res);
	}

}
