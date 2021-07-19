package com.examples;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		System.out.println("Example for Linked HAsh MAp");
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		
		System.out.println(lmap.put(101, "ABC"));
		System.out.println(lmap.put(102, "DEF"));
		System.out.println(lmap.put(103, "GHI"));
		System.out.println(lmap.put(104, "JKL"));
		System.out.println(lmap.put(105, "MNO"));
		
		System.out.println("Before Adding duplicate");
		for(Entry<Integer, String> entry: lmap.entrySet()){
			System.out.println("Key is : " + entry.getKey() + ", Value is : "+ entry.getValue());
		}
		
		System.out.println("----------------------------------------------------------");
		System.out.println(lmap.put(101, "XYZ"));
		
		for(Entry<Integer, String> entry: lmap.entrySet()){
			System.out.println("Key is : " + entry.getKey() + ", Value is : "+ entry.getValue());
		}
		
	}
	
}
