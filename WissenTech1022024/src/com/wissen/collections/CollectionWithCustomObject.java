package com.wissen.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionWithCustomObject {
	
	public static void main(String[] args) {
		
		Person p1= new Person(2, "Kesava",20000);
		Person p2= new Person(1, "Jan",10000);
		Person p3= new Person(3, "Ram",30000);
		Person p4= new Person(4, "Sham",40000);
		Person p5= new Person(4, "Sham",40000);
		
		ArrayList<Person> ar= new ArrayList<>();
		ar.add(p1);
		ar.add(p2);
		ar.add(p3);
		ar.add(p4);
		ar.add(p5);
		System.out.println(ar);
		for(Person obj:ar) {
			System.out.println(obj);
			
		}
		
		
		HashSet<Person> hs= new HashSet<>();
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		hs.add(p5);
		
	System.out.println(hs);
	for(Person test:hs) {
		System.out.println("HashSet::"+test);
	}
	
	
	LinkedHashSet<Person> lhs= new LinkedHashSet<>();
	lhs.add(p1);
	lhs.add(p2);
	lhs.add(p3);
	lhs.add(p4);
	lhs.add(p5);
	
	for(Person lhsRes:lhs) {
		System.out.println("linkedHashSet:: "+lhsRes);
	}
	
	TreeSet<Person> ts=new TreeSet<>();
	ts.add(p1);
	ts.add(p2);
	ts.add(p3);
	ts.add(p4);
	ts.add(p5);
	System.out.println(ts);
	for(Person person:ts) {
		System.out.println("Treeset Output  : "+person);
	}
	
	
	
	
	
		
		
		
		
		
		
		
	}

}
