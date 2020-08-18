package com.seleniumexpress.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {

		System.out.println("I am your Science Teacher");
		System.out.println("My name is Jack");
		

	}

}
