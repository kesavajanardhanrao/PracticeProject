package com.wissen.revision;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapTest {
	
	public static void main(String[] args) {
		TreeMap<Integer,String> hmap= new TreeMap<>();
		hmap.put(1, "Vizag");
		hmap.put(3, "Hyd");
		hmap.put(3, "Delhi");
		hmap.put(2, "Bangolore");
		hmap.put(4, "CHennai");
		
		System.out.println(hmap);
		
		
	}
	
	

}
