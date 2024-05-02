package com.wissen.error;

public class Test {
	
	
	
	public static void main(String[] args) {
		
		int test1=126423;
		String test2="sffjs";
		
		 System.out.println(Integer.toBinaryString(test1));

		int[] intArray= {10,20,30,40};
		System.out.println(intArray[4]);
		
		
		
		int i=20;
		System.out.println(i);
		
		try {
		System.out.println(i/0);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("WissenTech");
		System.out.println("WissenTech");
		System.out.println("WissenTech");
		System.out.println("WissenTech");
		System.out.println("WissenTech");
		System.out.println("WissenTech");
		System.out.println("WissenTech");
		String str="Vizag";
		try {
		System.out.println(Integer.parseInt(str));
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
	}

}
