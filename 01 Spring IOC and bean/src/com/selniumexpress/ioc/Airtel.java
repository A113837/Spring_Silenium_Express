package com.selniumexpress.ioc;

public class Airtel implements Sim{
	
	public Airtel() {
		System.out.println("Airtel Cons call");
	}

	@Override
	public void Calling() {
		System.out.println("calling airtel");
		
	}

	@Override
	public void data() {
		System.out.println("browsing using airtel");
		
	}

}
