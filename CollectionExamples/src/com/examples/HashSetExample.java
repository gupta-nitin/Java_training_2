package com.examples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		System.out.println("Adding A " + set.add("A"));
		System.out.println("Adding B " + set.add("B"));
		System.out.println("Adding C " + set.add("C"));
		System.out.println("Adding D " + set.add("D"));
		System.out.println("Adding A " + set.add("A"));
		
//		System.out.println("Removing G ..." +  set.remove("G"));
//		
//		System.out.println("Printing elements..." + set.size());
//		
		for (String element : set) {
			System.out.println(element);
		}

	}
}
