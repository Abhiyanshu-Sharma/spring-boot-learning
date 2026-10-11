package com.isrdc.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	
	private String studentName;
	
	private String studentCollege;
	
	@OneToMany(mappedBy = "student")
	private List<StudentCourse> studentCourses;

	public Student() {
		super();
	}

	public Student(String studentName, String studentCollege) {
		super();
		this.studentName = studentName;
		this.studentCollege = studentCollege;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCollege() {
		return studentCollege;
	}

	public void setStudentCollege(String studentCollege) {
		this.studentCollege = studentCollege;
	}

	public List<StudentCourse> getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(List<StudentCourse> studentCourses) {
		this.studentCourses = studentCourses;
	}
	

//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCollege=" + studentCollege
//				+ "]";
//	}
	


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCollege=" + studentCollege
				+ ", studentCourse=" + studentCourses + "]";
	}
	
	
}
