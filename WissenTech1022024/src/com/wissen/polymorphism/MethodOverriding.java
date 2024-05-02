package com.wissen.polymorphism;

public class MethodOverriding  extends Parent{
	
	@Override
	public void m1() {
		System.out.println("M1 method from MethodOverriding");
	}
	
	
	  @Override 
	  public void add(int a, int b) { String
	  str=String.valueOf(a)+String.valueOf(b); System.out.println(str);
	  }
	  
	 
	 
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.m1();
		p.m2();
		p.m3();
		p.add(10,20);
		MethodOverriding test= new MethodOverriding();
		test.add(20,30);
		
		Parent test1= new MethodOverriding();
		test1.add(50,50);
		Parent.m4();
		
		
		
		
		
		
	}

}
