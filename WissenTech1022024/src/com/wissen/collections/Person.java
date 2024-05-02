package com.wissen.collections;

import java.util.Objects;

public class Person  implements Comparable<Person>{
	
	int id;
	String name;
	int salary;
	
	
	public Person(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name) && salary == other.salary;
	}


	@Override
	public int compareTo(Person p) {
		return name.compareTo(p.name);
		
	}

	
	

	
	
	
	

}
