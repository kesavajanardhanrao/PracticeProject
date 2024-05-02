package com.wissen.accessmodifierstest;

import com.wissen.accessmodifiers.MainTest;

public class AccessModifiersTest extends MainTest {
	
	
	public void m6() {
		System.out.println("M6 method");
	}
	
	
	
	public void m5() {
		AccessModifiersTest test= new AccessModifiersTest();
		test.protecteMethod();
		AccessModifiersTest.protecedStatic();
		
		MainTest main= new MainTest();
		main.publicMethod();
		MainTest.publicStatic();
		MainTest.protecedStatic();
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		MainTest test= new MainTest();
		test.publicMethod();
		
		AccessModifiersTest ac= new AccessModifiersTest();
		ac.protecteMethod();
		
		
		
		
	}
	

}
