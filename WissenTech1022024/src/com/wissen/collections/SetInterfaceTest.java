package com.wissen.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterfaceTest {
	
	public void hashsetTest() {
		HashSet hs= new HashSet<>();
		hs.add(10);
		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add(30);
		hs.add(30);
		hs.add(70);
		hs.add(70);
		hs.add(80);
		hs.add(90);
		hs.add(110);
		hs.add(100);
		System.out.println("HashSet result : "+hs);
		
	}
	
	public void linkedHashSetTest() {
		LinkedHashSet hs= new LinkedHashSet<>();
		hs.add("Wissen");
		hs.add("Tech");
		hs.add("Vizag");
		hs.add("HYd");
		hs.add("Bangolore");
		hs.add(30);
		hs.add(70);
		hs.add(70);
		hs.add(80);
		hs.add(90);
		hs.add(110);
		hs.add(100);
		System.out.println("LinkedHashSet result : "+hs);
		
	}
	
	public void treeSetTest() {
		TreeSet hs= new TreeSet<>();
		hs.add(10);
		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add(30);
		hs.add(30);
		hs.add(70);
		hs.add(70);
		hs.add(80);
		hs.add(90);
		hs.add(110);
		hs.add(100);
		System.out.println("Before adding arrayList TreeSet result : "+hs);
	}
	
	
	public void setTest() {
		ArrayList ar = new ArrayList();
		ar.add(300);
		ar.add(200);
		ar.add(300);
		ar.add(200);
		ar.add(300);
		ar.add(200);
		HashSet hs= new HashSet();
		hs.addAll(ar);
		System.out.println("after adding arrayList in hashset result : "+hs);
		LinkedHashSet lhs= new LinkedHashSet<>();
		lhs.addAll(ar);
		System.out.println("after adding arrayList in Linkedhashset result : "+lhs);
		
		ArrayList citys = new ArrayList();
		citys.add("Hyd");
		citys.add("Ban");
		citys.add("Chennai");
		citys.add("Delhi");
		citys.add("Dehradun");
		citys.add("Ban");
		citys.add("Chennai");
		System.out.println("Cities :  "+citys);
		TreeSet sortCities= new TreeSet();
		//sortCities.addAll(citys);
		Collections.sort(citys);
		
		System.out.println("after sorting Cities :  "+citys);
		
		
		
		
	}
	
	public TreeSet m1(int i,int j,int k) {
		 TreeSet ts= new TreeSet();
		 ts.add(i);
		 ts.add(j);
		 ts.add(k);
		 System.out.println(ts);
		 
		 for (Object object : ts) {
			 System.out.println(object);
		}
		 Iterator itr=ts.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 
		 
		 
		 
		 return ts;
		 
		 
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		SetInterfaceTest test= new SetInterfaceTest();
		test.hashsetTest();
		test.linkedHashSetTest();
		test.treeSetTest();
		test.setTest();
		test.m1(30, 10, 10);
		
		
		
		
		
	}

}
