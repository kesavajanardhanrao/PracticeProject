package com.wissen.accessmodifiers;

public class MainTest {

	public void publicMethod() {
		System.out.println("publicMethod method from com.wissen.accessmodifiers.SampleMethods");

	}

	private void privateMethod() {
		System.out.println("privateMethod method from com.wissen.accessmodifiers.SampleMethods");
	}

	void defaultMethods() {

		System.out.println("DefaultMethod from com.wissen.accessmodifiers.SampleMethods");
	}

	protected void protecteMethod() {
		System.out.println("ProtectedMethod from com.wissen.accessmodifiers.SampleMethods");
	}

	public static void publicStatic() {
		System.out.println("public Static  method");
	}

	private static void privateStatic() {
		System.out.println("private Static  method");
	}

	static void defaultStatic() {
		System.out.println("default Static  method");
	}

	protected static void protecedStatic() {
		System.out.println("proteced Static  method");
	}

	public void evenOrOdd(int a, int b) {

		for (a = a; a <= b; a++) {
			if (a % 2 == 0) {
				System.out.println("Even Number  " + a);
			} else {
				System.out.println("Odd Number  " + a);
			}
		}

	}
	
	
	String  addStringValues(String s1,String s2){
		String s3=s1+s2;
		return s3;
	}
	
	protected int addIntValues(int a,int b) {
		
		int c= a+b;
		return c;
	}
	
	
	public static long addLongValues(long l1,long l2) {
		long l3=l1+l2;
		return l3;
	}
	
	

	private static void fabonacciSeries(int x) {
		int a1 = 0;
		int a2 = 1;
		int a3;
		System.out.println(a1); // 2
		System.out.println(a2);// 3
		for (int a = 2; a <= x; a++) {
			a3 = a1 + a2;
			System.out.println(a3); // 5
			a1 = a2;
			a2 = a3;
			

		}

	}

	public static void main(String[] args) {
		MainTest test = new MainTest();
		test.publicMethod();
		test.privateMethod();
		test.defaultMethods();
		test.protecteMethod();
		MainTest.publicStatic();
		MainTest.privateStatic();
		MainTest.defaultStatic();
		MainTest.protecedStatic();
		MainTest.fabonacciSeries(20);
		int intRes=test.addIntValues(10, 20);
		System.out.println("intRes  "+intRes);
		String strRes=test.addStringValues("Wissen", "  Tech");
		System.out.println("strRes  "+strRes);
		long longRes=MainTest.addLongValues(35165,318361);
		System.out.println("LongRes  "+longRes);
		

	}

}
