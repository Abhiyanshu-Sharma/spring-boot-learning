package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isrdc.services.EmployeeService;

@SpringBootApplication
public class Sdj13Application {

	public static void main(String[] args) {
//		SpringApplication.run(Sdj13Application.class, args).getBean(EmployeeService.class).findEmployeeByIdHardCode();
//		SpringApplication.run(Sdj13Application.class, args).getBean(EmployeeService.class).findAllEmployees();
//		SpringApplication.run(Sdj13Application.class, args).getBean(EmployeeService.class).changeEmployeeName();
//		SpringApplication.run(Sdj13Application.class, args).getBean(EmployeeService.class).changeEmployeeNameAndEmail();
		SpringApplication.run(Sdj13Application.class, args).getBean(EmployeeService.class).deleteEmployee();
	}

}
