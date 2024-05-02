package com.wissen.java8features;

public class InterfaceTest implements InterfaceDemo, InterfaceDemo2 {

	@Override
	public void m1() {
		System.out.println("InterfaceTest m1 method");
	}

	@Override
	public void m3() {
		System.out.println("Defualt method from InterfaceTest child class");
	}

	public static void main(String[] args) {
		InterfaceDemo test = new InterfaceTest();
		test.m1();
		InterfaceDemo.m2();
		test.m3();
		test.addStrings("Wissen", "Tech");

		InterfaceTest test2 = new InterfaceTest();
		test2.m1();
		InterfaceDemo2.addIntergers(10, 20);

	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub

	}
}
