package com.isrdc.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Employee;
import com.isrdc.repos.EmployeeRepo;

@Service
public class EmployeeService {
	private EmployeeRepo empRepo;
	
	@Autowired
	public void setEmpRepo(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
	}
	
	public void showEmployeesBySalaryGreaterThan() {
		List<Employee> emps = empRepo.findBySalaryGreaterThan(50000f);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		for(Employee emp : emps)
			System.out.println(emp);
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
	}
	
	public void showEmployeeByAgeBetween() {
		List<Employee> emps = empRepo.findByAgeBetween(28, 50);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		for(Employee emp : emps)
			System.out.println(emp);
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
	}
	
	public void showByEmail() {
		Employee emp = empRepo.findByEmail("vijay@gmail.com");
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
			System.out.println(emp);
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
	}
	
	public void showAllEmailEndsWith() {
		List<Employee> emps = empRepo.findByEmailEndsWith("ymail.com");
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		for(Employee emp : emps)
			System.out.println(emp);
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
	}
	
	public void showAllByGender() {
		List<Employee> emps = empRepo.findByGender('F');
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		for(Employee emp : emps)
			System.out.println(emp);
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
	}
	
	public void saveAllEmployees() {
		Employee e1 = new Employee("Jay", "jay@ymail.com", "123456", 32, 45000f, 'M', true, "US");
		Employee e2 = new Employee("Vijay", "vijay@gmail.com", "234567", 28, 78000f, 'M', true, "UK");
		Employee e3 = new Employee("Ajay", "Ajay@ymail.com", "345678", 56, 64000f, 'M', false, "US");
		Employee e4 = new Employee("Namita", "namita@ymail.com", "456789", 25, 37000f, 'F', false, "Bharat");
		Employee e5 = new Employee("Gurdeep", "girdeep@gmail.com", "567891", 47, 98000f, 'F', true, "US");
		Employee e6 = new Employee("Teena", "teena@gmail.com", "678912", 35, 42000f, 'F', false, "UK");
		Employee e7 = new Employee("Deepti", "deepti@ymail.com", "789123", 51, 56000f, 'F', true, "Bharat");
		
		empRepo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7));
	}
}
