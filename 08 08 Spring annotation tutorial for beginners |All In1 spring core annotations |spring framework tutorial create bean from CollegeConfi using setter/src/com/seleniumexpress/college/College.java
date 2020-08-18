package com.seleniumexpress.college;

import org.springframework.stereotype.Component;

@Component("testId")
public class College {
	
	private Principal principal;
	
	

	
	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("using setPrincipal method");
	}	



	public void test() {
		System.out.println("invoke College class @Bean CollegeConfig testId method");
		principal.principalInfo();
	}





}
