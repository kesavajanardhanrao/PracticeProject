package com.wissen.revision;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}

	int id;
	String name;
	int age;
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
	
	
	
	

}
