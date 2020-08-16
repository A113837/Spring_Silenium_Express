package com.seleniumexpress.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("beans.xml loaded ");
		College college = context.getBean("collegeBean", College.class);
		System.out.println("The college object created by spring is:  "+ college);
		
		

	}

}
