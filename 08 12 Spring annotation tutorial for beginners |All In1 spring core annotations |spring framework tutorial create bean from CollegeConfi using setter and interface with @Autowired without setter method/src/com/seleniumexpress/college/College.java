package com.seleniumexpress.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Autowired	
	private Principal principal;
	
	@Autowired	
	private Teacher teacher;
	
	



	public void test() {
		System.out.println("invoke College class @Bean CollegeConfig testId method");
		teacher.teach();
		principal.principalInfo();
	}





}
