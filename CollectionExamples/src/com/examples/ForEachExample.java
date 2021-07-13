package com.examples;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		
		String[] arr = {"A", "B", "C", "D", "E"};
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		for( Integer element : list  ){
			System.out.println( "Element is  + " + element );
		}
		
		
		
	}
	
}
