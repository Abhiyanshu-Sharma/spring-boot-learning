package com.isrdc.repos;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.isrdc.entities.Employee;

import jakarta.transaction.Transactional;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
}
