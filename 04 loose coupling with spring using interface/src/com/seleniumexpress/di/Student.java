package com.seleniumexpress.di;

public class Student {
	
	private int id;
	
	//private MathCheat mathCheat;
	
	private Cheat cheat;
	
	
	
//	  public void setMathCheat(MathCheat mathCheat) { 
//		  this.mathCheat = mathCheat; 
//	  }
	 
	
//	  public void setCheat(ScienceCheat cheat) {
//		this.cheat = cheat;
//	}


	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}


	public void cheating() { 
		  cheat.cheat();
	}
	 

	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
