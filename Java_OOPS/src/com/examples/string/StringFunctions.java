package com.examples.string;

public class StringFunctions {

	public static void main(String[] args) {
		
		String s1 = "aBc";
		String s2 = "abc";
		
		
		System.out.println("Result : "+s1.compareTo(s2));
		System.out.println("Result : "+s1.equals(s2));
		
		
		
		System.out.println("Result : "+s1.trim().toLowerCase());
		System.out.println("Result : "+s1.toLowerCase().trim());
		/*
		 * s1.trim = aBc  obj1
		 * toLowerCase = abc;  obj2
		 * ---------------------    
		 * s1.toLowerCase =     aBc   //
		 * s1.trim = aBc
		 */
		
		
		System.out.println("Result : "+s1.toUpperCase().trim());
		System.out.println("Result : "+s1.trim());
		
		System.out.println("Vaue of s1 : " + s1) ;
		
		
	}
	
}
