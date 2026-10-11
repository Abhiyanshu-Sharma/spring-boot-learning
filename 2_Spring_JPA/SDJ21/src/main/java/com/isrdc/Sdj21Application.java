package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.serives.UserService;

@SpringBootApplication
public class Sdj21Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Sdj21Application.class, args);
		
		UserService userServ = context.getBean(UserService.class);
		
//		userServ.saveUser();
		userServ.showUser();
	}

}
