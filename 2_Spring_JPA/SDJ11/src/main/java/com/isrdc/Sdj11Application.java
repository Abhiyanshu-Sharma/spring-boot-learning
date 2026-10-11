package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isrdc.services.EmployeeService;

@SpringBootApplication
public class Sdj11Application {

	public static void main(String[] args) {
//		SpringApplication.run(Sdj11Application.class, args).getBean(EmployeeService.class).saveAllEmployees();
//		SpringApplication.run(Sdj11Application.class, args).getBean(EmployeeService.class).countEmployeesByCity();
//		SpringApplication.run(Sdj11Application.class, args).getBean(EmployeeService.class).countEmployeesByCityEndsWith();
//		SpringApplication.run(Sdj11Application.class, args).getBean(EmployeeService.class).existsEmployeesByNameAndCityIgnoreCase();
//		SpringApplication.run(Sdj11Application.class, args).getBean(EmployeeService.class).fetchTop2EmployeesBySalary();
		SpringApplication.run(Sdj11Application.class, args).getBean(EmployeeService.class).fetchEmployeesBySalaryDesc();
	}

}
