package com.wissen.polymorphism;

public class MethodOverloading {
	
	public void add(int a, int b) {
		int c= a+b;
		System.out.println(c);
	}
	
	public int add(int a,int b,int c) {
		int sum= a+b+c;
		System.out.println(sum);
		return sum;
		
	}
	
	public String add(int x, String s) {
		String c= String.valueOf(x)+s;
		System.out.println(c);
		return c;
	}
	
	public String fundTransfer(String vpa) {
		//vpa= kesavaLenka@ybl
		boolean accountVerified= true;
		if(accountVerified) {
			System.out.println("fund transfered from vpa "+vpa);
		}
		
		return "amount has been credited to receiver's bank";
		
	}
	
	public static void fundTransfer(long phNo) {
		System.out.println("Funds transfered based on phone number");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		MethodOverloading test= new MethodOverloading();
		test.add(10,30);
		test.add(10,"WissenTech");
		test.add(50,100,150);
		MethodOverloading.fundTransfer(89777193);
		String res=test.fundTransfer("kesava@ybl");
		System.out.println(res);
		
	}

}
