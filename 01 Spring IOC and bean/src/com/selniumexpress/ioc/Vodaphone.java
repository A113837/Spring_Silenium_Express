package com.selniumexpress.ioc;

public class Vodaphone implements Sim{

	@Override
	public void Calling() {
		System.out.println("calling Vodaphone");
		
	}

	@Override
	public void data() {
		System.out.println("browsing using Vodaphone");
		
	}

}
