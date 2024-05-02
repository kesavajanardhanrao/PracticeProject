package com.wissen.java8features;

public interface InterfaceDemo {

	public void m1();

	public static void m2() {
		System.out.println("m2 static method");

	}

	default void m3() {
		System.out.println("Default m3 method");
	}

	default String addStrings(String str1, String str2) {
		String str3 = str1 + str2;
		System.out.println(str3);
		return str3;
	}

}
