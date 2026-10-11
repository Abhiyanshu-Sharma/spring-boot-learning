package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isrdc.entities.Employee;
import com.isrdc.services.EmployeeService;

@SpringBootApplication
public class Sdj7Application {

	public static void main(String[] args) {
//		SpringApplication.run(Sdj7Application.class, args).getBean(EmployeeService.class).saveAllEmployees();
//		SpringApplication.run(Sdj7Application.class, args).getBean(EmployeeService.class).deleteEmployeeById();
//		SpringApplication.run(Sdj7Application.class, args).getBean(EmployeeService.class).deleteEmployee();
//		SpringApplication.run(Sdj7Application.class, args).getBean(EmployeeService.class).deleteAllEmployees();
//		SpringApplication.run(Sdj7Application.class, args).getBean(EmployeeService.class).deleteAllSpecifiedEmployees();
		SpringApplication.run(Sdj7Application.class, args).getBean(EmployeeService.class).deleteEmployeeById();
	}

}
