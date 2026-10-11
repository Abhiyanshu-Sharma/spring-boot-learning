package com.isrdc.repos;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.isrdc.entities.Student;

public interface StudentRepo extends CrudRepository<Student, Serializable> {
	
}