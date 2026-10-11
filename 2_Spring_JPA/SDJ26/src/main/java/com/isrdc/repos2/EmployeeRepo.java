package com.isrdc.repos2;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isrdc.entities2.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
