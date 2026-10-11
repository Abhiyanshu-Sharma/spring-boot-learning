package com.isrdc.services;

import com.isrdc.repos.StudentCourseRepo;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Course;
import com.isrdc.entities.Student;
import com.isrdc.entities.StudentCourse;
import com.isrdc.repos.CourseRepo;
import com.isrdc.repos.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private CourseRepo courseRepo;
	
	@Autowired
	private StudentCourseRepo stuCorRepo;

	
	public void saveStudentCourse() {
		
		Student st1 = new Student("Ram", "SRIT");
		Student st2 = new Student("Om", "Global");
		studentRepo.saveAll(Arrays.asList(st1, st2));
		
		System.out.println(st1.getStudentId() + "----------");
		
		Course cr1 = new Course("Java", 6);
		Course cr2 = new Course("Python", 8);
		Course cr3 = new Course("ReactJS", 2);
		courseRepo.saveAll(Arrays.asList(cr1, cr2, cr3));
		
		StudentCourse sc1 = new StudentCourse();
		sc1.setStudent(st1);
		sc1.setCourse(cr1);
		stuCorRepo.save(sc1);
		
	}
}
