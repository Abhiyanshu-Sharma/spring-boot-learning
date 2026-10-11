package com.isrdc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Student;
import com.isrdc.repos.StudentRepo;

@Service
public class StudentService {
	private StudentRepo studentRepo;
	
//	@Autowired
	public StudentService(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}
	
	public void saveAllStudent() {
		
	}
	
	public void saveStudent() {
//		studentRepo.save(new Student("Jay", "jay@gmail.com", "8978564534"));
		studentRepo.save(new Student("Vijay", "vijay@gmail.com", "8968568989"));
//		studentRepo.save(new Student(1,"Vijay Deenanath Chohan", "vijaydc@gmail.com", "9768568989"));
	}
}
