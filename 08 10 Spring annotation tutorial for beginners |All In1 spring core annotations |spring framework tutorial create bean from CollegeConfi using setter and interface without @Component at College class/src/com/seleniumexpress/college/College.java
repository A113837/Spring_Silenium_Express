package com.seleniumexpress.college;

import org.springframework.stereotype.Component;


public class College {
	
	private Principal principal;
	
	private Teacher teacher;
	
		
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}



	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("using setPrincipal method");
	}	



	public void test() {
		System.out.println("invoke College class @Bean CollegeConfig testId method");
		teacher.teach();
		principal.principalInfo();
	}





}
