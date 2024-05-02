package com.wissen.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ar= new ArrayList<>();
		ar.add(10);
		ar.add(40);
		ar.add(5);
		ar.add(30);
		ar.add(25);
		ar.add(35);
		ar.add(45);
		
		// Filter 
		ar.stream().filter(x->x%2==0).forEach(x->System.out.println(x +"is a even Number"));		
		
		//filter + Terminal operation ( Convert as list)
		/*
		 * List<Integer> list=ar.stream().filter(x->9).collect(Collectors.toList());
		 * System.out.println(list);
		 */
		
		
		List<Integer> oddList=ar.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(oddList);
		
		
		List<Integer> mapOutput=ar.stream().map(x->x*10).collect(Collectors.toList());
		System.out.println(mapOutput);
		
		List<Integer> sortOutput=ar.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortOutput);
		
		List<Integer> skipOutput=ar.stream().skip(2).collect(Collectors.toList());
		System.out.println(skipOutput);
		
		List<Integer> limitOutput=ar.stream().limit(3).collect(Collectors.toList());
		
		System.out.println(limitOutput);
		
		List<Integer> limitAndSortOutput=ar.stream().limit(3).sorted().collect(Collectors.toList());
		System.out.println(limitAndSortOutput);
		
		List<Integer> limitSortandMapOutput=ar.stream().limit(3).sorted().map(x->x*20).collect(Collectors.toList());
		System.out.println(limitSortandMapOutput);
		
		//(10,40,30,25,35,45);
		
		List<Integer> limitSortMapandOddnumberOutput=ar.stream().limit(3).sorted().map(x->x*5).filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(limitSortMapandOddnumberOutput);
		
		long count=ar.stream().limit(3).sorted().map(x->x*5).filter(x->x%2!=0).count();
		System.out.println(count);
		
		System.out.println("Original Data: "+ar);
		
		Optional<Integer> findFirstoutput=ar.stream().findFirst();	
		System.out.println(findFirstoutput);
		
		Optional<Integer> reduceoutput=ar.stream().reduce((a, b) -> a+b);
		System.out.println(reduceoutput);
		
		
	}
	
	

}
