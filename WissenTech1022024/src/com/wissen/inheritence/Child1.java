package com.wissen.inheritence;

public class Child1 extends Parent {
	
	public void child1Method() {
		System.out.println("Child1 method");
		String city= "Vizag";
		Child1 c= new Child1();
		String organization=c.name+city;
		System.out.println(organization);
		
		
	}
	
	public static void main(String[] args) {
		Child1 c1= new Child1();
		c1.child1Method();
		c1.parentMethod();       // Single - Level
		c1.grandParentMethod();  // Multi - Level
	
		
		
		Child2 c2= new Child2();
		c2.parentMethod();
		c2.child2Method();
		
		Child3 c3= new Child3();
		c3.parentMethod();
		c3.child3Method();            // Heirarchal Inheritence
		
		
		
		
		
		
		
		
		
	}

}
