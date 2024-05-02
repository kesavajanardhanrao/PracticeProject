package com.wissen.interfacetest;

public abstract class ParentAbstract1 {

	public int id;
	public String studentName = "Ram";
	public static int studentAge=20;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public abstract void m3();

	public abstract void m4();

	public String evenOrOdd(int x) {
		String str;
		if (x % 2 == 0) {
			str = "even Number" + x;
		} else {
			str = "Odd NUmber " + x;
		}
		return str;

	}

}
