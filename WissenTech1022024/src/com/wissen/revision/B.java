package com.wissen.revision;

public class B {
	
	static B obj = new B();
	
	private B() {
		
	}
	
	public static B getInstance () {
		return obj;
	}
	
	
	

	public void m2() {
		System.out.println("m2 method");
	}

	public void m3() {
		System.out.println("m3a method");
	}

}
