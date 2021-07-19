package com.examples;

import java.util.TreeSet;

class TreeSetExample_2 {
	public static void main(String args[]) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		System.out.println("Adding 8 " + set.add(8));
		System.out.println("Adding 10 " + set.add(10));
		
		System.out.println("Adding 3 " + set.add(3));
		System.out.println("Adding 6 " + set.add(6));
		System.out.println("Adding 4 " + set.add(4));
		System.out.println("Adding 14 " + set.add(14));
		System.out.println("Adding 7 " + set.add(7));
		System.out.println("Adding 1 " + set.add(1));
		System.out.println("Adding 13 " + set.add(13));
		
		System.out.println("The elements available in the Tree set are " + set);
		
	}
}
