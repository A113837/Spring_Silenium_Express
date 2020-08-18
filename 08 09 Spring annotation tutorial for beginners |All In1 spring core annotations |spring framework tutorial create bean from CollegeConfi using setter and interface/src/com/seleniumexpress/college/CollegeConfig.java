package com.seleniumexpress.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.seleniumexpress.college")
public class CollegeConfig {
	
	@Bean
	public Principal principalBean()
	{
		return new Principal();
	}
	
	public Teacher mathTeacherBean()
	{
		return new MathTeacher();
	}
	
	@Bean()
	public College collegeBean() {
		College college = new College();
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacherBean());
		return college;
	}

}
