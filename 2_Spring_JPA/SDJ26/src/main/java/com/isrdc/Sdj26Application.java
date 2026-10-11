package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.EmployeeService;
import com.isrdc.services.StudentService;

@SpringBootApplication
public class Sdj26Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Sdj26Application.class, args);
		
		StudentService stServ = context.getBean(StudentService.class);
		EmployeeService empServ = context.getBean(EmployeeService.class);
		
		stServ.saveStudent();
		empServ.saveEmployee();
	}

}
