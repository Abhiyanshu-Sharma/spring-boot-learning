package com.isrdc.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.isrdc.entities.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	@Query(value="from Employee where employeeId= :employeeId")
	Employee searchRecordOnTheBasisOf(Integer employeeId);
	
	@Query(value="from Employee where employeeId=1")
	Employee searchRecordOnTheBasisOf();
	
	@Query(value="from Employee")
	List<Employee> searchAllRecords();
	
	@Query(value="from Employee where city= :cityName and salary>:salary")
	Employee searchRecordsOnTheBasisOf(String cityName, Float salary);
	
	@Query(value="update Employee set name= 'samundar' where employeeId= :employeeId")
	@Transactional
	@Modifying
	void changeNameById(Integer employeeId);
	
	
	@Query(value="update Employee set name= :newName, email= :newEmail where employeeId= :employeeId")
	@Transactional
	@Modifying
	void changeNameByIdAndEmail(String newName, String newEmail,Integer employeeId);
	
	@Query(value="delete from Employee where employeeId= :employeeId")
	@Transactional
	@Modifying
	void deleteById(Integer employeeId);
	
}
