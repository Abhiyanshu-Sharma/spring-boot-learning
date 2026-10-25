package com.isrdc.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.dtos.StudentDTO;
import com.isrdc.entities.Student;
import com.isrdc.repos.StudentRepo;


@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	
	public void deleteStudentRecord(Integer studentId) {
		studentRepo.deleteById(studentId);
	}
	
	
	public void insertStudentRecord(StudentDTO studentDto) {
		Student student = new Student();
		
		BeanUtils.copyProperties(student, student);
		
		studentRepo.save(student);
	}
	
	
	public ArrayList<StudentDTO> collectAllStudents() {
		List<Student> students = studentRepo.findAll();
		
		ArrayList<StudentDTO> studentDtos = new ArrayList<>();
		
		for(Student student : students) {
			StudentDTO studentDTO = new StudentDTO();
			
			BeanUtils.copyProperties(students, studentDtos);
			
			studentDtos.add(studentDTO);
		}
		
		return studentDtos;
	}

	
	public void saveStudent(StudentDTO studentDto) {
		Student student = new Student();
		
		BeanUtils.copyProperties(studentDto, student);
		
		studentRepo.save(student);
	}
}
