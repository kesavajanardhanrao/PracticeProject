package com.wissen.revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionTest {
	public static void main(String[] args) {
		
		HashSet ar = new HashSet<>();
		ar.add("Hyd");
		ar.add("Sec");
		ar.add("Delhi");
		ar.add("Delhi");
		ar.add("Chennai");
		ar.add("Bangolore");
		
		
		System.out.println(ar);
		//Collections.sort(ar);
		//System.out.println(ar);
		
		Employee emp1= new Employee(1, "Keshav", 20);
		Employee emp2= new Employee(3, "Jan", 20);
		Employee emp3= new Employee(2, "Ram", 20);
		Employee emp4= new Employee(2, "Ram", 20);
		
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		System.out.println(hs.toString());
		
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(emp1);
		ts.add(emp2);
		ts.add(emp3);
		ts.add(emp4);
		System.out.println(ts);
		
		
				
	}
	
}
