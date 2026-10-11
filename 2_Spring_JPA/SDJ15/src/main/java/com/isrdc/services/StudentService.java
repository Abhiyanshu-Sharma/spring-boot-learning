package com.isrdc.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Student;
import com.isrdc.repos.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo stdRepo;
	
	public void saveAllStudents() {
		Student s1 = new Student("Mohan", "mohan@global.com", "Global");
		Student s2 = new Student("Jay", "jay@ggct.com", "GGCT");
		Student s3 = new Student("Samyak", "samyak@jec.com", "JEC");
		
		stdRepo.saveAll(Arrays.asList(s1,s2,s3));
	}
}
