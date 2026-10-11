package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isrdc.services.EmployeeService;

@SpringBootApplication
public class Sdj10Application {

	public static void main(String[] args) {
//		SpringApplication.run(Sdj10Application.class, args).getBean(EmployeeService.class).saveAllEmployees();
//		SpringApplication.run(Sdj10Application.class, args).getBean(EmployeeService.class).showAllByGender();;
//		SpringApplication.run(Sdj10Application.class, args).getBean(EmployeeService.class).showAllEmailEndsWith();
//		SpringApplication.run(Sdj10Application.class, args).getBean(EmployeeService.class).showByEmail();
//		SpringApplication.run(Sdj10Application.class, args).getBean(EmployeeService.class).showEmployeeByAgeBetween();
		SpringApplication.run(Sdj10Application.class, args).getBean(EmployeeService.class).showEmployeesBySalaryGreaterThan();
	}

}
