package com.examples;

import java.util.TreeSet;

class TreeSetExample {
	public static void main(String args[]) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		System.out.println("Adding C " + set.add("C"));
		System.out.println("Adding D " + set.add("D"));
		System.out.println("Adding A " + set.add("A"));
		System.out.println("Adding B " + set.add("B"));
		
		System.out.println("Adding A " + set.add("A"));
		
		System.out.println("The elements available in the Tree set are " + set);
		
	}
}
