package com.isrdc;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.bos.UserBO;
import com.isrdc.services.UserService;

@SpringBootApplication
public class Sdj1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Sdj1Application.class, args);
		
		UserService userService = context.getBean(UserService.class);
		
		userService.saveUser("Yamraj", 10000);
		
		ArrayList<UserBO> users = userService.fetchAllUsers();
		
		System.out.println("=====================================");
		
		for(UserBO userBO : users)
			System.out.println(userBO.getName() + " | " + userBO.getAge());
		
		System.out.println("=====================================");
		
		
	}

}
