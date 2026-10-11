package com.isrdc.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Course;
import com.isrdc.entities.Student;
import com.isrdc.repos.CourseRepo;
import com.isrdc.repos.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private CourseRepo courseRepo;
	
	public void saveStudentCourse() {
		Student st1 = new Student("Ram", "SRIT");
		Student st2 = new Student("Om", "Global");
		studentRepo.saveAll(Arrays.asList(st1, st2));
		
		System.out.println(st1.getStudentId() + "----------");
		
		Course cr1 = new Course("Java", 6);
		Course cr2 = new Course("Python", 8);
		Course cr3 = new Course("ReactJS", 2);
		courseRepo.saveAll(Arrays.asList(cr1, cr2, cr3));
		
//		Would work because @JoinTable is in Student
		st1.setCourse(Arrays.asList(cr1, cr3));
		studentRepo.save(st1);
		
		st2.setCourse(Arrays.asList(cr1, cr2, cr3));
		studentRepo.save(st2);
		
		cr1.setStudents(Arrays.asList(st1, st2));
		cr2.setStudents(Arrays.asList(st2));
		cr3.setStudents(Arrays.asList(st1, st2));
		
//		Would not work
//		Course is inverse join, does not have @JoinTable
//		courseRepo.save(cr1);
//		courseRepo.save(cr2);
//		courseRepo.save(cr3);
		
		
		
		
		
		
		
	}
}
