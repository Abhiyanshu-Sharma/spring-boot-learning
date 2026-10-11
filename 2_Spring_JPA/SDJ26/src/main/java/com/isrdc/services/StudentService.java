package com.isrdc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities1.Student;
import com.isrdc.repos1.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo stRepo;
	
	public void saveStudent() {
		Student s = new Student("Gagan", "gag@email.com", "123456");
		
		stRepo.save(s);
	}
}
