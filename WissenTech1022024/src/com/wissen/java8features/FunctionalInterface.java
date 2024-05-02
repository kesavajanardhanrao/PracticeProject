package com.wissen.java8features;
import java.lang.*;

@java.lang.FunctionalInterface
public interface FunctionalInterface {

	public int  m1(int a, int b);
	
	public static void m2() {
		System.out.println("Static method from Function Interface");
	}

	default void m3() {
		System.out.println("default method from Function Interface");
	}

}
