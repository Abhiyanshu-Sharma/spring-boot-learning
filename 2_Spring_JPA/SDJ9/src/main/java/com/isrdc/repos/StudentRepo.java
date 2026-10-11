package com.isrdc.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.isrdc.entities.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
