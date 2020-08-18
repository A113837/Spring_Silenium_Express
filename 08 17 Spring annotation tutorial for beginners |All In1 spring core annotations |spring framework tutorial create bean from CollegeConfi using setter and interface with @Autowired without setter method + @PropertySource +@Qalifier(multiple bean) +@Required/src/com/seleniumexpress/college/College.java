package com.seleniumexpress.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	
	
	private String collegeName;
	
	@Autowired	
	private Principal principal;
	
	@Autowired
	@Qualifier("mathTeacher")
	private Teacher teacher;
	
	
	@Required
	@Value("${college.Name}")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}



	public void test() {
		System.out.println("invoke College class @Bean CollegeConfig testId method");
		teacher.teach();
		System.out.println("My college name is: " + collegeName);
		principal.principalInfo();
	}





}
