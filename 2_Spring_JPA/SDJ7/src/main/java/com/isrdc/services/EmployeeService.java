package com.isrdc.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Employee;
import com.isrdc.repos.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo empRepo;
	
	public void deleteAllEmployees() {
		empRepo.deleteAll();
	}
	
	public void deleteAllSpecifiedEmployees() {
		empRepo.deleteAll(Arrays.asList(new Employee(2), new Employee(4)));
	}
	
	public void deleteEmployee() {
		empRepo.delete(new Employee(1));
	}
	
	public void deleteEmployeeById() {
		empRepo.deleteById(3);
	}
	
	public void saveAllEmployees() {
		empRepo.saveAll(Arrays.asList(
				new Employee(1, "Mangesh", "mangu@gmail.com", "8978675645"),
				new Employee(2, "Sudesh", "sud@ymail.com", "7867564342"),
				new Employee(3, "kamlesh", "kaml@rediff.com", "9034789563"),
				new Employee(4, "Vighnesh", "vigh@gmail.com", "6756129067")
				
				));
	}
}
