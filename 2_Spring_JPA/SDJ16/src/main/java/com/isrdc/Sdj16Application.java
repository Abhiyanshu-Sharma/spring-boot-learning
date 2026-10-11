package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isrdc.services.EmployeeService;

@SpringBootApplication
public class Sdj16Application {

	public static void main(String[] args) {
//		SpringApplication.run(Sdj16Application.class, args).getBean(EmployeeService.class).sortByField("age");
		SpringApplication.run(Sdj16Application.class, args).getBean(EmployeeService.class).sortByField("salary", true);
	}
}
