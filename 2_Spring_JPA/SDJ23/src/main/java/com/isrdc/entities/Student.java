package com.isrdc.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	
	private String studentName;
	
	private String studentCollege;
	
	@ManyToMany
	@JoinTable(name = "student_courses",
				joinColumns = @JoinColumn(name = "student_id_fk"),
				inverseJoinColumns = @JoinColumn(name = "course_id_fk"))
	private List<Course> course;

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

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCollege=" + studentCollege
//				+ "]";
//	}
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCollege=" + studentCollege
				+ ", course=" + course + "]";
	}
	
	
}
