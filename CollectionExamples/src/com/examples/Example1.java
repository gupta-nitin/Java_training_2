package com.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List names = new ArrayList<>(10);

		for (int index = 0; index > -1; index++) {
			System.out.print("Please enter name - ");
			String name = scanner.nextLine();
			if (name.equals("*")) {
				break;
			} else {
				names.add(name);
			}
			if(names.size()==11){
				System.out.println("Size is : "+ names.size());
			}
		}
		print(names);
	}

	private static void print(List<String> names) {
		System.out.println("Printing all names");
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("Size  of arraylist : "+ names.size());
	}

}
