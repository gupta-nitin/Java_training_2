package com.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		System.out.println(map.put(101, "ABC"));
		System.out.println(map.put(102, "DEF"));
		System.out.println(map.put(103, "GHI"));
		System.out.println(map.put(104, "JKL"));
		System.out.println(map.put(105, "MNO"));
		
		System.out.println("Before Adding duplicate");
		for(Entry<Integer, String> entry: map.entrySet()){
			System.out.println("Key is : " + entry.getKey() + ", Value is : "+ entry.getValue());
		}
		System.out.println("------------------------");
		System.out.println(map.put(101, "XYZ"));
		
		for(Entry<Integer, String> entry: map.entrySet()){
			System.out.println("Key is : " + entry.getKey() + ", Value is : "+ entry.getValue());
		}
		
	}

}
