package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isrdc.services.EmployeeService;

@SpringBootApplication
public class Sdj8Application {

	public static void main(String[] args) {
		SpringApplication.run(Sdj8Application.class, args).getBean(EmployeeService.class).saveAllEmployees();
//		SpringApplication.run(Sdj8Application.class, args);
	}

}
