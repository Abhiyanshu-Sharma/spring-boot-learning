package com.isrdc.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.isrdc.entities.Employee;
import com.isrdc.repos.EmployeeRepo;

@Service
public class EmployeeService {

	private EmployeeRepo empRepo;
	
	public EmployeeService(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
	}
	
	public void UpdateEmployeeById() {
		empRepo.UpdateEmployeeById(8, "Jabalpur", "99999", 18);
	}
	
	public void fetchAllEmployeesByIds() {
		List<Employee> emps = empRepo.fetchAllEmployeesByIds(Arrays.asList(1,3,7));
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		for(Employee next : emps)
			System.out.println(next);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public void fetchEmployeeById() {
		Employee emps = empRepo.fetchEmployeeById(5);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println(emps);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public void fetchAllEmployees() {
		List<Employee> emps = empRepo.fetchAllEmployees();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		for(Employee next : emps)
			System.out.println(next);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public void saveAllEmployees() {
		Employee e1 = new Employee("Jay", "jay@ymail.com", "123456", 32, 45000f, "nagpur", 'M');
		Employee e2 = new Employee("Vijay", "vijay@gmail.com", "234561", 28, 78000f, "pune", 'M');
		Employee e3 = new Employee("Ajay", "ajay@ymail.com", "345612", 56, 64000f, "hyderabad", 'M');
		Employee e4 = new Employee("Namita", "namita@gmail.com", "456123", 25, 37000f, "bengluru", 'F');
		Employee e5 = new Employee("Gurdeep", "gurdeep@ymail.com", "561234", 47, 98000f, "pune", 'F');
		Employee e6 = new Employee("Teena", "teena@gmail.com", "612345", 35, 42000f, "chennai", 'F');
		Employee e7 = new Employee("Deepti", "deepti@ymail.com", "123457", 51, 56000f, "kanpur", 'F');
		Employee e8 = new Employee("Sagar", "sagar@ymail.com", "345799", 23, 18000f, "raipur", 'M');
		Employee e9 = new Employee("Mahesh", "mahesh@gmail.com", "342299", 39, 41000f, "pune", 'M');
		Employee e10 = new Employee("Manoj", "manoj@rediffmail.com", "112299", 43, 51000f, "jaipur", 'M');
		Employee e11 = new Employee("Chandrika", "chandra@ymail.com", "112288", 61, 120000f, "pune", 'F');
		
		empRepo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11));
	}
}
