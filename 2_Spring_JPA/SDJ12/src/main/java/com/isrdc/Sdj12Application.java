package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isrdc.services.EmployeeService;

@SpringBootApplication
public class Sdj12Application {

	public static void main(String[] args) {
//		SpringApplication.run(Sdj12Application.class, args).getBean(EmployeeService.class).fetchEmployeeByGenderAndCity();
//		SpringApplication.run(Sdj12Application.class, args).getBean(EmployeeService.class).fetchEmployeesByEmailCitySalary();
		SpringApplication.run(Sdj12Application.class, args).getBean(EmployeeService.class).fetchEmployeesByEmailCityInSalary();
	}

}
