package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isrdc.services.UserService;

@SpringBootApplication
public class Sdj6Application {

	public static void main(String[] args) {
//		SpringApplication.run(Sdj6Application.class, args).getBean(UserService.class).countAllUsers();
		SpringApplication.run(Sdj6Application.class, args).getBean(UserService.class).existUserById();
	}

}
