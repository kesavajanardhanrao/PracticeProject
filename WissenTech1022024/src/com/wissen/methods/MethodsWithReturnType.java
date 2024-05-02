package com.wissen.methods;

public class MethodsWithReturnType {

	public float addFloatNumbers(float f1, float f2) {
		float f3 = f1 + f2;
		return f3;
	}

	public void m1() {
		System.out.println("This is m1 method");
	}

	public void m3() {
		System.out.println("This is m3 method");

	}

	public void m2() {
		System.out.println("This is m2 method");
		MethodsWithReturnType test = new MethodsWithReturnType();
		test.m1();
		test.m3();

	}

	public int forLoop(int i, int j) {
		int sum = 0;
		for (i = i; i <= j; i++) {
			// System.out.println(i);
			sum += i;
		}

		return sum;
	}

	public int nestedMethods(int i, int j) {
		System.out.println("Enter into Nested Methods ");
		MethodsWithReturnType test = new MethodsWithReturnType();
		int res = test.forLoop(i, j);
		System.out.println(res);

		return res;
	}

	public static void main(String[] args) {
		MethodsWithReturnType test = new MethodsWithReturnType();
		float result = test.addFloatNumbers(9.10f, 9.20f);
		System.out.println(result);
		test.m2();
		int forLoopResult = test.forLoop(10, 20);
		System.out.println(forLoopResult);
		test.nestedMethods(30, 40);

	}

}
