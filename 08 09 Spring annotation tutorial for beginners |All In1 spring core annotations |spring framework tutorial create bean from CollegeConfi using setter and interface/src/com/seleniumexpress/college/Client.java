package com.seleniumexpress.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		
		System.out.println("context loaded" + context);
		College college = context.getBean("collegeBean", College.class);
		System.out.println("college class loaded: "+ college);
		college.test();
		context.close();
	}

}
