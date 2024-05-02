package com.wissen.methods;

public class MethodsExample {

	public void addIntValues(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	public void m2() {
		int a = 20;
		int b = 30;
		int c = b - a;
		System.out.println(c);
	}
	public String addStrings(String str1, String str2) {
		String str3 = str1 + str2;
		System.out.println(str3);
		return str3;
	}
	
	public int addNumarics(int a , int b, int c, int d) {
		int result= a+b+c+d;
		return result;
	}
	
	public long addLongValues(long l1 ,long l2) {
		long l3=l1+l2;
		return l3;
	}
	public static void main(String[] args) {
		MethodsExample me = new MethodsExample();
		me.addIntValues(10, 20);
		me.m2();
		String  result=me.addStrings("Wissen", "Tech");
         int intResult=me.addNumarics(100,200,300,400);
         System.out.println(intResult);
	}

}
