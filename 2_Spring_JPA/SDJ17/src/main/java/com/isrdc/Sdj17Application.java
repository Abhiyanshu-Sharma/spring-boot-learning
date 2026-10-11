package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isrdc.services.EmployeeService;

@SpringBootApplication
public class Sdj17Application {

	public static void main(String[] args) {
//		SpringApplication.run(Sdj17Application.class, args).getBean(EmployeeService.class).saveAllEmployees();
//		SpringApplication.run(Sdj17Application.class, args).getBean(EmployeeService.class).fetchEmployeeQBE();
//		SpringApplication.run(Sdj17Application.class, args).getBean(EmployeeService.class).fetchEmployeesByPage(1);
//		SpringApplication.run(Sdj17Application.class, args).getBean(EmployeeService.class).fetchEmployeesByPage(2);
//		SpringApplication.run(Sdj17Application.class, args).getBean(EmployeeService.class).fetchEmployeesByPage(3);
//		SpringApplication.run(Sdj17Application.class, args).getBean(EmployeeService.class).fetchEmployeesByPage(4);
		SpringApplication.run(Sdj17Application.class, args).getBean(EmployeeService.class).fetchEmployeesByPage(5);
	}

}
