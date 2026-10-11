package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.StudentService;

@SpringBootApplication
public class Sdj25Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Sdj25Application.class, args);
		
		StudentService stServ = context.getBean(StudentService.class);
		
		stServ.saveStudent();
	}

}
