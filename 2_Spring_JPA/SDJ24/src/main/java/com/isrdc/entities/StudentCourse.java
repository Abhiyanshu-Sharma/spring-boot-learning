package com.isrdc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_courses")
public class StudentCourse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentCourseId;
	
	@ManyToOne
	@JoinColumn(name = "student_id_fk")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "course_id_fk")
	private Course course;
	

	public StudentCourse() {
		super();
	}

	public StudentCourse(Student student, Course course) {
		super();
		this.student = student;
		this.course = course;
	}

	public Integer getStudentCourseId() {
		return studentCourseId;
	}

	public void setStudentCourseId(Integer studentCourseId) {
		this.studentCourseId = studentCourseId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	
	
}
