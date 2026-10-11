package com.isrdc.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.isrdc.entities.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
