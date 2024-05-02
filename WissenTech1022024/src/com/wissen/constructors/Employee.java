package com.wissen.constructors;

import com.wissen.setterandgetter.Student;

public class Employee {
	public int id;
	public String name;
	public int age;
	public String address;
	public long phNumber;
	
	
	public Employee (int id,String n,int age,String add,long ph) {
		this.id=id;
		this.name=n;
		this.age=age;
		this.address=add;
		this.phNumber=ph;
	}
	public Employee() {
		
	}
	
	public static void main(String[] args) {
		Employee e1= new Employee(1, "Kesava",20, "Vizag",89777);
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.phNumber);
		
		
		Employee e2= new Employee(2, "Janardhan",20, "Hyd",89777);
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.phNumber);
		
		Employee e3= new Employee(3, "Ram",20, "Bangolre",89777);
		System.out.println(e3.id);
		System.out.println(e3.name);
		System.out.println(e3.age);
		System.out.println(e3.phNumber);
		
		Employee e4= new Employee(4, "John",20, "Chnnai",89777);
		System.out.println(e4.id);
		System.out.println(e4.name);
		System.out.println(e4.age);
		System.out.println(e4.phNumber);
		
		
		Employee e5 = new Employee(5,"Trump",0,null,0);
		System.out.println(e5.id);
		System.out.println(e5.name);
		System.out.println(e5.age);
		System.out.println(e5.address);
		System.out.println(e5.phNumber);
		
		
		
		
		
	}
	
	
	
	

}
