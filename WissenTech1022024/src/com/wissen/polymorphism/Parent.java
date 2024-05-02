package com.wissen.polymorphism;

public class Parent {
	
	
	public void m1() {
		System.out.println("M1 method from parent");
	}
	public void m2() {
		System.out.println("M2 method from parent");
	}
	public void m3() {
		System.out.println("M3 method from parent");
	}
	
	
	public void add(int a , int b) {
		int c= a+b;
		System.out.println(c);
		
	}
	
	public static void m4() {
		System.out.println("Static m4 method from parent Class");
	}
	
	

}
