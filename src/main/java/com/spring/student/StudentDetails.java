package com.spring.student;

public class StudentDetails {
	private String name;
	private int age;

	// Getters and setters   
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting Name");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setting Age");
		this.age = age;
	}
	
	public void display() {
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
	}
}