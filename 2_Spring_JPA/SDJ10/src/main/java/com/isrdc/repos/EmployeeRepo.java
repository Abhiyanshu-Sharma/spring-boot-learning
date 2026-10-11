package com.isrdc.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.isrdc.entities.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	List<Employee> findByGender(Character gender);
	List<Employee> findByEmailEndsWith(String emailEndsWith);
	
	Employee findByEmail(String email);
	
	List<Employee> findByAgeBetween(int fromAge, int toAge);
	
	List<Employee> findBySalaryGreaterThan(float salary);
}
