package com.seleniumexpress.college;

import org.springframework.stereotype.Component;


public class College {
	
	private Principal principal;
	
	
	
	public College(Principal principal) {
		this.principal = principal;
	}



	public void test() {
		
		principal.pricipalInfo();
		System.out.println("Testing this class College collegeBean methods");
	}

} 
