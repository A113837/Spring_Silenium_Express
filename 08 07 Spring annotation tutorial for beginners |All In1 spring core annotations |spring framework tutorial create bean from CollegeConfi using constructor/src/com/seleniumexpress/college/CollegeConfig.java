package com.seleniumexpress.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.seleniumexpress.college")
public class CollegeConfig {
	
	@Bean
	public Principal principalBean() {
		return new Principal();
	}

	@Bean
	public College collegeBean() //collegeBean - bean id
	{
		
		College college = new College(principalBean());
		return college;
	}
	
	
}
