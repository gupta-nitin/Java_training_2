package com.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLisstExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(30);
		System.out.println("Values in list = " + list);
		
//		System.out.println("Enter index to remove");
		Integer value = 30;
		
		boolean removeElement = list.remove(value);
		
		System.out.println("REmoved element is = " + removeElement);
		System.out.println("Current size is  = "+ list.size());
		
		for (Integer element : list) {
			System.out.println("Element is  = " + element);
		}
		
	}
}
