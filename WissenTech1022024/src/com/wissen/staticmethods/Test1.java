package com.wissen.staticmethods;

import com.wissen.accessmodifiers.MainTest;

public class Test1 {
	
	String name="WissneTech";
	static String city="Vizag";
	

	public static void m1() {
		System.out.println("Static M1 Method");
	}

	public static int forLoop(int a, int b) {
		int sum = 0;
		for (a = a; a <= b; a++) {
			sum += a;
		}
		return sum;

	}
	
	public static String intToStringConvert(int i,int j,int k) {
		
		int l=i+j+k;
		String str=Integer.toString(l);
		return str;
	}
	
	
	public static int stringToIntConvert(String str1,String str2) {
		String str3=str1+str2;
		//str3 ="1020"
		Integer res=Integer.parseInt(str3);//1020
		return res;
		
		
	} 
	
	public static String m4(String str1) {
		String str2=Test1.city;
		Test1 t= new Test1();
		String str3=t.name;
		String str4=str1+str2+str3;
		return str4;
		
		
	}
	
	

	public static void main(String[] args) {

		Test1.m1();
		int result=Test1.forLoop(20,40);
		System.out.println(result);
		int res2=Test1.stringToIntConvert("10", "20");
		System.out.println(res2);
		
		Test1 t= new Test1();
		System.out.println(t.name);
		
		System.out.println(Test1.city);
		String res3=Test1.m4("Java");
		System.out.println(res3);
		
		MainTest main = new MainTest();
		main.evenOrOdd(10, 50);

	}

}
