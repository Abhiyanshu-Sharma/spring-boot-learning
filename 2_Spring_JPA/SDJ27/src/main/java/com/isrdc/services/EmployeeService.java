package com.isrdc.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.isrdc.secnentities.Employee;
import com.isrdc.secnrepos.EmployeeRepo;

public class EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;
	
	public void saveEmployee() {
		Employee e = new Employee("Mr Prakash", "TCS");
		
		empRepo.save(e);
	}
}
