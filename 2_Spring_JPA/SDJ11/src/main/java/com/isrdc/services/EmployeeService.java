package com.isrdc.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Employee;
import com.isrdc.repos.EmployeeRepo;

@Service
public class EmployeeService {
	
		@Autowired
		private EmployeeRepo empRepo;
		
		public void fetchEmployeesBySalaryDesc() {
			List<Employee> emps = empRepo.findByOrderBySalaryDesc();
			
			System.out.println("+++++++++++++++++++++++++++++++++++");
			for(Employee emp : emps)
				System.out.println(emp);
			System.out.println("+++++++++++++++++++++++++++++++++++");
		}
		
		public void fetchTop2EmployeesBySalary() {
			List<Employee> emps = empRepo.findTop2ByOrderBySalaryDesc();
			
			System.out.println("+++++++++++++++++++++++++++++++++++");
			for(Employee emp : emps)
				System.out.println(emp);
			System.out.println("+++++++++++++++++++++++++++++++++++");
		}
		
		public void existsEmployeesByNameAndCity() {
			System.out.println(empRepo.existsByNameAndCity("teena", "Jabalpur"));
		}
		
		public void existsEmployeesByNameAndCityIgnoreCase() {
			System.out.println(empRepo.existsByNameAndCityIgnoreCase("teena", "jabalpur"));
		}
		
		public void countEmployeesByCityEndsWith() {
			long count = empRepo.countByCityEndsWith("pur");
			
			System.out.println(count + "~~~~~~~~~~~~~~");
		}
		
		public void countEmployeesByCity() {
			long count = empRepo.countByCity("Pune");
			
			System.out.println(count + "~~~~~~~~~~~~~~");
		}

	
		public void saveAllEmployees() {
			Employee e1 = new Employee("Jay", "jay@ymail.com", "123456", 32, 45000f, "Nagpur" ,'M');
			Employee e2 = new Employee("Vijay", "vijay@gmail.com", "234567", 28, 78000f, "Pune",'M');
			Employee e3 = new Employee("Ajay", "Ajay@ymail.com", "345678", 56, 64000f, "Hydrabad",'M');
			Employee e4 = new Employee("Namita", "namita@ymail.com", "456789", 25, 37000f, "Delhi",'F');
			Employee e5 = new Employee("Gurdeep", "girdeep@gmail.com", "567891", 47, 98000f, "Mumbai",'F');
			Employee e6 = new Employee("Teena", "teena@gmail.com", "678912", 35, 42000f, "Jabalpur",'F');
			Employee e7 = new Employee("Deepti", "deepti@ymail.com", "789123", 51, 56000f, "Pune",'F');
			
			empRepo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7));
	}
}
