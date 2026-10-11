package com.isrdc.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.isrdc.entities.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	
	List<Employee> findByGenderAndCityIn(Character gender, List<String> cities);
	
	List<Employee> findByEmailContainsAndCityAndSalaryGreaterThan(String emailPart, String city, Float salary);
	
	List<Employee> findByEmailContainsAndCityInAndSalaryGreaterThan(String emailPart, List<String> cities, Float salary);
	

}
