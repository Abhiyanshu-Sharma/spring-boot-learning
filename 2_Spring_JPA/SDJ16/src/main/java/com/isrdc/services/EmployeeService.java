package com.isrdc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Employee;
import com.isrdc.repos.EmployeeRepo;

@Service
public class EmployeeService {

	private EmployeeRepo empRpo;
	
	@Autowired
	public EmployeeService(EmployeeRepo empRpo) {
		this.empRpo = empRpo;
	}
	
	
	
	public void sortByField(String field, Boolean asending) {
		Sort sort;
		if(asending) {
			sort = Sort.by(field);
		} else {
			sort = Sort.by(field).descending();
		}	
		
		List<Employee> emps = empRpo.findAll(sort);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		for(Employee emp : emps)
			System.out.println(emp);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
	}
}
