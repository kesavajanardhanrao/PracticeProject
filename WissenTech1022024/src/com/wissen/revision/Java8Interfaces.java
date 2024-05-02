package com.wissen.revision;
@FunctionalInterface
public interface Java8Interfaces {
	public String m1(String str1,String str2);
	static void m2() {
		System.out.println("Static Method");
	}

	default void m3() {
		System.out.println("default Method");
	}
	
	
}
