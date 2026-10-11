package com.isrdc.secnrepos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isrdc.secnentities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
