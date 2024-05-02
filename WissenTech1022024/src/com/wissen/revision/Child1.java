package com.wissen.revision;

public class Child1 implements Java8Interfaces {
	
	public static void main(String[] args) {
		
		    Java8Interfaces fn=(String s1,String s2)-> {
		    	String s3=s1+s2;
		    	System.out.println(s3);
		    	return s3;
		    };
		    fn.m1("Hyderbad","Secundrabad");
		   Java8Interfaces.m2();
		   
		   Java8Interfaces test= new Child1();
		   test.m3();
		
		
	}

	@Override
	public String m1(String str1, String str2) {
		String s3= str1+str2;
		System.out.println(s3);
		return s3;
	}
	
	
	
	
	
	

}
