package com.spring.student;

public class StudentService {
	private StudentDetails studentDetails;

	// Setter for StudentDetails
	public void setStudentDetails(StudentDetails studentDetails) {
		System.out.println("Setting studentDetails");
		this.studentDetails = studentDetails;
	}
	
	public void displayStudentInfo() {
		studentDetails.display();
	}
}