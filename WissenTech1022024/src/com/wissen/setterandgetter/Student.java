package com.wissen.setterandgetter;

public class Student {
	public int id;
	public String name;
	public int age;
	public String address;
	public long phNumber;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(long phNumber) {
		this.phNumber = phNumber;
	}
	
	
	public static void main(String[] args) {
		
		Student s= new Student();
		s.setId(1);
		s.setName("Ram");
		s.setAge(20);
	
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getAddress());
		System.out.println(s.getPhNumber());
		
		
		
	}
	
	
	
	
	

}
