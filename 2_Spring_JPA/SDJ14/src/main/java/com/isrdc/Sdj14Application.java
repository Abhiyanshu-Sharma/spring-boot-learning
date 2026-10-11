package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isrdc.services.EmployeeService;

@SpringBootApplication
public class Sdj14Application {

	public static void main(String[] args) {
//		SpringApplication.run(Sdj14Application.class, args).getBean(EmployeeService.class).saveAllEmployees();
//		SpringApplication.run(Sdj14Application.class, args).getBean(EmployeeService.class).fetchAllEmployees();
//		SpringApplication.run(Sdj14Application.class, args).getBean(EmployeeService.class).fetchEmployeeById();
//		SpringApplication.run(Sdj14Application.class, args).getBean(EmployeeService.class).fetchAllEmployeesByIds();
		SpringApplication.run(Sdj14Application.class, args).getBean(EmployeeService.class).UpdateEmployeeById();
		
	}

}
