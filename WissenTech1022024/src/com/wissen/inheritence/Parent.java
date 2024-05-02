package com.wissen.inheritence;

public class Parent  extends GrandParent{
	
	public String name= "WissenTech";
	public static int age= 20;
	
	
	public void parentMethod() {
		System.out.println("parent method");
		 Parent p = new Parent();
		 String name=p.name;
		
	}
	
	public void accountRegistration() {
		System.out.println("accountRegistration");
		
	}
	
	
	
	
	
	

}
