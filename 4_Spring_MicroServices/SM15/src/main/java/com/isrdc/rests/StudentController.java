package com.isrdc.rests;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.StudentDTO;
import com.isrdc.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
//	GET MAPPING
	@GetMapping(value = "/show_all_students", produces = {"application/json", "application/xml"})
	public ResponseEntity<ArrayList<StudentDTO>> showAllStudents() {
		ArrayList<StudentDTO> studentDto = studentService.collectAllStudents();
		
		return ResponseEntity.ok(studentDto);
	}
	
//	POST MAPPING
	@PostMapping(value = "/register_student", produces = "text/plain", consumes = {"application/json", "application/xml"})
	public ResponseEntity<String> registerStudent(@RequestBody StudentDTO studentDto) {
		studentService.insertStudentRecord(studentDto);
		
		return new ResponseEntity<>("Student Record Saved...!", HttpStatus.CREATED);
	}
	
//	DELETE MAPPING
	@DeleteMapping(value = "/delete_student/{student_id}", produces = "text/plain")
	public ResponseEntity<String> deleteStudent(@PathVariable("student_id") Integer studentId) {
		studentService.deleteStudentRecord(studentId);
		
		return new ResponseEntity<>("Student Record Is Deleted...", HttpStatus.ACCEPTED);
	}
	
//	PUT MAPPING
	@PutMapping(value = "/update_student", produces = "text/plain", consumes = "application/json")
	public ResponseEntity<String> updateStudent(@RequestBody StudentDTO studentDto) {
studentService.insertStudentRecord(studentDto);
		
		return new ResponseEntity<String>("Student Record Is Updated...", HttpStatus.ACCEPTED);
	}
}

