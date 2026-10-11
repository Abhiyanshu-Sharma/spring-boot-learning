package com.isrdc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities2.Employee;
import com.isrdc.repos2.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;
	
	public void saveEmployee() {
		Employee emp = new Employee("Mr Prabhakar", "prabh@gmail.com", "123456");
		empRepo.save(emp);
	}
}
