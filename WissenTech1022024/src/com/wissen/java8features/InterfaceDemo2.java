package com.wissen.java8features;

public interface InterfaceDemo2 {
	default void m1() {
		System.out.println("me thod from InterfaceDemo2");
	}

	public static void m2() {
		System.out.println("m2 static method");

	}

	default void m3() {
		System.out.println("Default m3 method");
	}

	public void m4();
	
	public static int  addIntergers(int a, int b) {
		int c= a+b;
		System.out.println(c);
		return c;
	}

}
