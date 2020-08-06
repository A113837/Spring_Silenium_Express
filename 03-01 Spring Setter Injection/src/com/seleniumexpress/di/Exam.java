package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student abhi = context.getBean("student", Student.class);
		abhi.displayStudentInfo();
		
		
		Student ashish = context.getBean("ashish", Student.class);
		ashish.displayStudentInfo();
		
		//abhi.setStudentName("John");
		//abhi.displayStudentInfo();
		
	}
}
