package com.isrdc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Student;
import com.isrdc.repos.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studRepo;
	
	public void saveStudent() {
		Student s = new Student("Naman", "nam@gmail.com", "123456", "7889786756");
		
		studRepo.save(s);
	}
}