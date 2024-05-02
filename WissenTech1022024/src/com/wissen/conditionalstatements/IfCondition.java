package com.wissen.conditionalstatements;

import com.wissen.accessmodifiers.MainTest;

public class IfCondition {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 30;
		int c = 40;

		if (a > b) {
			System.out.println("a is less than b");
		}else {
			System.out.println("a is greater than b");
		}
		
		
		if(a==20 && b==35 && c==40) {
			System.out.println("a value is "+a);
			System.out.println("b value is "+b);
			System.out.println("c value is "+c);
			
		}else {
			System.out.println("a,b, c Values not defined "+a+" "+b+" "+c);
		}
		
		
		if(b==30 || c==35) {
			System.out.println("b and c values are  "+ b +" " +c);
		}
		
		
		if(a!=20) {
			System.out.println("a value is not equal to 20");
		}else {
			System.out.println("a value is  equal to 20");
		}
		
		
		//c=40;
		// 40>39  || 40==39
		if(c>=39) {
			System.out.println("c value either 39 or greater than 39");
			
		}
		
		
		
		// <=  , Nested If , &&, || , if- esle 
		
		
		
		
		
		
		
		
		
		

	}

}
