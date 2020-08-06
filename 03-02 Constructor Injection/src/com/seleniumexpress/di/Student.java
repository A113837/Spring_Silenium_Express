package com.seleniumexpress.di;

public class Student {
	
	private String studentName;
	
	private int id;
	
	public Student(int id) {
		this.id = id;
	}
	
	public Student(int id, String studentName) {
		
		this.studentName = studentName;
		this.id = id;
	}





	public void displayStudentInfo() { 
		
		System.out.println("Student name is: " + studentName
				
								+" the id: " +id);
	}
	
	
}
