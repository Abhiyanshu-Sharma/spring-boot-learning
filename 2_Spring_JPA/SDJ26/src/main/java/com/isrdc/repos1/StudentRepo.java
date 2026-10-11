package com.isrdc.repos1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isrdc.entities1.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
