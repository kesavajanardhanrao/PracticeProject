package com.wissen.interfacetest;

public class Child extends ParentAbstract1 implements ParentInterface,ParentInterface2 {

	@Override
	public void m1() {
		System.out.println("M1 method");

	}

	@Override
	public void m2() {
		System.out.println("M2 method");

	}

	@Override
	public int add(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return c;
	}

	@Override
	public String addString(String str1, String str2) {
		String str3 = str1 + str2;
		System.out.println(str3);
		return str3;
	}

	public static void main(String[] args) {

		Child c = new Child();
		c.m1();
		c.m2();
		c.add(10, 20);
		
		c.addString(ParentInterface.name, ParentInterface2.qualification);
		c.sub(100,50);
		c.m3();
		c.m4();
		System.out.println(c.studentName);
		System.out.println(c.studentAge);
		c.setId(1);
		System.out.println(c.getId());
		
		

	}

	@Override
	public int sub(int a, int b) {
		int c=a-b;
		System.out.println(c);
		return c;
		
	}

	@Override
	public void m3() {
		System.out.println("M3 method");
		
	}

	@Override
	public void m4() {
		System.out.println("M4 method");
		
	}
	

}
