package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isrdc.services.StudentService;

@SpringBootApplication
public class Sdj9Application {

	public static void main(String[] args) {
		SpringApplication.run(Sdj9Application.class, args).getBean(StudentService.class).saveStudent();
	}

}
