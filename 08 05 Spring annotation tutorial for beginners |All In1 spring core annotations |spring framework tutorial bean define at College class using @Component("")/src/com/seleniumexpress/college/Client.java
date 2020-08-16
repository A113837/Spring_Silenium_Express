package com.seleniumexpress.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		
		System.out.println("AnnotationConfig loaded: "+context);
		College college = context.getBean("testid", College.class);
		System.out.println("The college object created by spring is:  "+ college);
		college.test();
		
		 

	}

}
