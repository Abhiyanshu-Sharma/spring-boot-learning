package com.isrdc.dtos;

public class StudentDTO {
	private String name;
	private Integer age;
	private Character gender; // M/F/O
	private String school;
	
	public StudentDTO() {
		super();
	}

	public StudentDTO(String name, Integer age, Character gender, String school) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.school = school;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String college) {
		this.school = college;
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", age=" + age + ", gender=" + gender + ", college=" + school + "]";
	}
	
	
}