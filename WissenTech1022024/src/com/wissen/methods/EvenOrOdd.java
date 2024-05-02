package com.wissen.methods;

public class EvenOrOdd {

	public void evenNumber() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Number : " + i);
			}
		}
	}

	public void oddNumber() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("odd Number : " + i);
			}
		}
	}

	public void m1() {
		System.out.println("Enter into M1 method");
	}

	public void m2() {
		System.out.println("Enter into M2 method");
	}

	public void m3() {
		System.out.println("Enter into M3 method");
	}

	public static void main(String[] args) {

		EvenOrOdd eo = new EvenOrOdd();
		eo.evenNumber();
		eo.oddNumber();
		eo.m1();
		eo.m2();
		eo.m3();
		
		

	}

}
