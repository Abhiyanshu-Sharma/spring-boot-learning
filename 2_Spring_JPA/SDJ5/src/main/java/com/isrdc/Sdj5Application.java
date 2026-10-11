package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.UserService;

@SpringBootApplication
public class Sdj5Application {

	public static void main(String[] args) {
//		SpringApplication.run(Sdj5Application.class, args).getBean(UserService.class).saveAllUsers();
//		SpringApplication.run(Sdj5Application.class, args).getBean(UserService.class).fetchUserById();
//		SpringApplication.run(Sdj5Application.class, args).getBean(UserService.class).fetchAllUsers();
		SpringApplication.run(Sdj5Application.class, args).getBean(UserService.class).fetchAllUsersById();
		
	}

}
