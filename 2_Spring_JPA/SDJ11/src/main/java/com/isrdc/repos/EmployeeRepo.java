package com.isrdc.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.isrdc.entities.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	long countByCity(String city);
	
	long countByCityEndsWith(String citySuffix);
	
	boolean existsByNameAndCity(String name, String city);
	
	boolean existsByNameAndCityIgnoreCase(String name, String city);
	
	List<Employee> findTop2ByOrderBySalaryDesc();
	
	List<Employee> findByOrderBySalaryDesc();

}
