package com.seleniumexpress.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value("${college.Name}")
	private String collegeName;
	
	@Autowired	
	private Principal principal;
	
	@Autowired	
	private Teacher teacher;
	
	

	public void test() {
		System.out.println("invoke College class @Bean CollegeConfig testId method");
		teacher.teach();
		System.out.println("My college name is: " + collegeName);
		principal.principalInfo();
	}





}
