	package com.isrdc;
	
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.ConfigurableApplicationContext;
	
	import com.isrdc.services.UserService;
	
	@SpringBootApplication
	public class Sdj2Application {
	
		public static void main(String[] args) {
			ConfigurableApplicationContext context = SpringApplication.run(Sdj2Application.class, args);
			
			UserService userService = context.getBean(UserService.class);
			
			userService.saveUser(2, "Abhiyanshu Sharma", 22);
		}
	
	}