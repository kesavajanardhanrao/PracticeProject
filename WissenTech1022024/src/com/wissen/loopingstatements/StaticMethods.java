package com.wissen.loopingstatements;

public class StaticMethods {

	public static void m1() {
		System.out.println("M1 static method");
	}
	public static void m2() {
		System.out.println("M2 static method");
	}
	public static void m3() {
		System.out.println("M3 static method");
	}
	public static void m4() {
		System.out.println("M4 static method");
	}
	public static void m5() {
		System.out.println("M5 static method");
		
		StaticMethods.m1();
		StaticMethods.m2();
		StaticMethods.m3();
		StaticMethods.m4();
	}
	
	public String converIntToString() {
		int a=100;
		String str=String.valueOf(a);
		
		int dah=Integer.parseInt(str);
		return str;
		
	}
	
	
	

	public static void main(String[] args) {
		StaticMethods.m1();
		StaticMethods.m2();
		StaticMethods.m3();
		StaticMethods.m4();
		StaticMethods.m5();

		
	}

}
