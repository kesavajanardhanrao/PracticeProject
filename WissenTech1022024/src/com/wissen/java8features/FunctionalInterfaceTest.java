package com.wissen.java8features;

public class FunctionalInterfaceTest {
	public static void main(String[] args) {
		
		FunctionalInterface fn=(int a, int b)->{
			int c=a+b;
			System.out.println(c);
			return c;
		};
		fn.m1(10, 20);
		
		
		FunctionalInterface2 f2= (String str1,String str2)->{
			String str3= str1+str2;
			System.out.println(str3);
			return str3;
		};
		f2.addStrings("Vizag", "Hyderbad");
		
		
		
		
	}
	
	

}
