package com.examples.string;

public class StringExample {

	public static void main(String[] args) {
		
		String str1 = "Hello"; // using literals
		String str2 = new String("world"); // using new keyword
		
		String str3 = str1 + " " + str2; // Creates another object in memory
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str3);
		
		System.out.println(str1);
		System.out.println(str2);
		
	}
	
}
