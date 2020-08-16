package com.seleniumexpress.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.seleniumexpress.college")
public class CollegeConfig {

	@Bean(name= {"colBean", "anotherBean"})
	public College collegeBean() //collegeBean - bean id
	{
		
		College college = new College();
		return college;
	}
}
