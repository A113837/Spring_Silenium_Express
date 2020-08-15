package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("octopusHeart")
	private Heart heart;
	
	public Human() {
		
	}

	
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("human constr is get called");
	}

//	@Autowired
//	@Qualifier("octopusHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method heart called");
	}
	
	public void startPumping() {
		if( heart != null)
		{
			heart.pump();
			System.out.println("name of the animal is: "
					+ heart.getNameOfAnimal()
					+ " the no of heart is: "
					+ heart.getNoOfHeart());
		}
		else
		{
			System.out.println("You are dead");
		}
		
	}

}
