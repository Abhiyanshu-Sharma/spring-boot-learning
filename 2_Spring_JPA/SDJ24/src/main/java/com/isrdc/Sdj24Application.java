package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.StudentService;

@SpringBootApplication
public class Sdj24Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Sdj24Application.class, args);
		
		StudentService stuServ = context.getBean(StudentService.class);
		
		stuServ.saveStudentCourse();
	}

}
