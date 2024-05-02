package com.wissen.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionTest {
	
	
	public static void main(String[] args) {
		
		Vector ar= new Vector<>();
		ar.add(1);
		ar.add(10);
		ar.add(2);
		ar.add(10);
		ar.add("abc");
		System.out.println(ar);
		System.out.println(ar.get(1));
		ar.add(2, 50);
		System.out.println(ar);  // 1 10 50 2 10 abc
		ar.remove(0);
		System.out.println(ar);   //[10, 50, 2, 10, abc]
		System.out.println(ar.size());
		ar.addAll(ar);
		System.out.println(ar);
		//ar.removeAll(ar);
		//System.out.println(ar);
		System.out.println(ar.isEmpty());
		System.out.println(ar.contains(70));
		
		
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		for(Object obj:ar) {
			System.out.println("foreach:: "+obj);
			
		}
		
		Iterator itr=ar.iterator();
		while(itr.hasNext()) {
			System.out.println("Iterartor::: "+itr.next());
		}
		
		
		
	}

}
