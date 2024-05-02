package com.wissen.accessmodifiers;

public class AccessibilityTestWithinPackage {
	
	public void m2() {
		MainTest test= new MainTest();
		test.publicMethod();
		test.defaultMethods();
		test.protecteMethod();
	}
	
	public static void main(String[] args) {
		AccessibilityTestWithinPackage test = new AccessibilityTestWithinPackage();
		test.m2();
		
		MainTest sample= new MainTest();
		sample.publicMethod();
		sample.defaultMethods();
		sample.protecteMethod();
		MainTest.publicStatic();
		MainTest.defaultStatic();
		MainTest.protecedStatic();
		
		
	}

}
