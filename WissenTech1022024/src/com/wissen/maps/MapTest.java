package com.wissen.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

import com.wissen.collections.Person;

public class MapTest {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hmap= new HashMap<>();
		hmap.put(2,"Hyd");
		hmap.put(3,"Chennai");
		hmap.put(5,"Ban");
		hmap.put(5,"Vizag");
		hmap.put(1,"Delhi");
		
		System.out.println(hmap);
		
		
		LinkedHashMap<Integer,String> lhmap= new LinkedHashMap<>();
		lhmap.put(2,"Hyd");
		lhmap.put(3,"Chennai");
		lhmap.put(5,"Ban");
		lhmap.put(5,"Vizag");
		lhmap.put(1,"Delhi");
		
		System.out.println(lhmap);

		TreeMap<Integer,String> smap= new TreeMap();
		smap.put(2,"Hyd");
		smap.put(3,"Chennai");
		smap.put(5,"Ban");
		smap.put(5,"Vizag");
		smap.put(1,"Delhi");
		
		System.out.println(smap);
		 for(Entry<Integer, String> mapRes:smap.entrySet()) {
			System.out.println(mapRes); 
		 }
		 
		 TreeMap<Integer,Person> pmap= new TreeMap();
		 Person p1= new Person(1,"Kesava",20000);
		 
		 pmap.put(2,new Person(1,"Kesava",20000));
		 pmap.put(3,new Person(1,"Kesava",20000));
		 pmap.put(5,new Person(2,"Kesava",20000));
		 pmap.put(5,new Person(3,"Kesava",20000));
		 pmap.put(1,new Person(1,"Kesava",20000));
			
		 
		 System.out.println(pmap);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
