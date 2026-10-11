package com.isrdc.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.isrdc.entities.Employee;

import jakarta.transaction.Transactional;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	
	@Query(value="update employees set city=:city,password=:password,age=:age where employee_id=:empId", nativeQuery = true)
	@Transactional
	@Modifying
	void UpdateEmployeeById(Integer empId, String city, String password, Integer age);
	
	@Query(value="select * from employees where employee_id in (:ids)", nativeQuery = true)
	List<Employee> fetchAllEmployeesByIds(List<Integer> ids);
	
	@Query(value="select * from employees", nativeQuery = true)
	List<Employee> fetchAllEmployees();
	
	@Query(value="select * from employees where employee_id=:empId", nativeQuery = true)
	Employee fetchEmployeeById(Integer empId);
}
