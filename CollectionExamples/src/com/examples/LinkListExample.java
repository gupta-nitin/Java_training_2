package com.examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkListExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> list = new LinkedList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("Values in list = " + list);
		
		System.out.println("Enter element to remove");
		Integer value = scanner.nextInt();
		
		boolean removeElement = list.remove(value);
		
		System.out.println("REmoved element success = " + removeElement);
		
		System.out.println("Current size is  = "+ list.size());
		
		for (Integer element : list) {
			System.out.println("Element is  = " + element);
		}
		
	}
	
}
