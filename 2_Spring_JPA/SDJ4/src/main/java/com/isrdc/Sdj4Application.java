package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.UserService;

@SpringBootApplication
public class Sdj4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Sdj4Application.class, args);
		
		UserService userService = context.getBean(UserService.class);
		
		userService.saveAllUsers();
	}

}
