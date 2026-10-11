package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.TransactionService;
import com.isrdc.services.UserService;

@SpringBootApplication
public class Sdj22Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Sdj22Application.class, args);
		
		UserService userServ = context.getBean(UserService.class);
		
		userServ.saveUser();
//		userServ.showUser();
//		userServ.deleteUser();
		
		
		TransactionService tranServ = context.getBean(TransactionService.class);
		tranServ.showTransaction();
	}

}
