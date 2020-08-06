package com.seleniumexpress.di;

public class Student {
	
	private String studentName;
	
	private int id;
	
	
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
		System.out.println("Setter method is called: setStudentName");
	}
	
	
	public void setId(int id) {
		this.id = id;
		System.out.println("Setter method is called: setId");
	}


	public void displayStudentInfo() { 
		
		System.out.println("Student name is: " + studentName
				
								+" the id: " +id);
	}
	
	
}
