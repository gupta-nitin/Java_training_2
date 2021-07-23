package com.examples;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

class TreeSetExample_2 {
	public static void main(String args[]) {
		
		Map<Integer, Integer> set = new TreeMap<Integer, Integer>();
		
		System.out.println("Adding 8 " + set.put(2, 100));
		System.out.println("Adding 10 " + set.put(9,50));
		
		System.out.println("Adding 3 " + set.put(3, 200));
//		System.out.println("Adding 6 " + set.add(6));
//		System.out.println("Adding 4 " + set.add(4));
//		System.out.println("Adding 14 " + set.add(14));
//		System.out.println("Adding 7 " + set.add(7));
//		System.out.println("Adding 1 " + set.add(1));
//		System.out.println("Adding 13 " + set.add(13));
		
		System.out.println("The elements available in the Tree set are " + set);
		
	}
}
