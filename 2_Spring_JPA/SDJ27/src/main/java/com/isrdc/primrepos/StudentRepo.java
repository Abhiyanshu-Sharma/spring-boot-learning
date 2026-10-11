package com.isrdc.primrepos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isrdc.primentities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
