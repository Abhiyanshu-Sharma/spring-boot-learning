package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isrdc.services.StudentService;

@SpringBootApplication
public class Sdj15Application {

	public static void main(String[] args) {
		SpringApplication.run(Sdj15Application.class, args).getBean(StudentService.class).saveAllStudents();
	}

}
