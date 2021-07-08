package com.examples;

public class DataTypeStringToOthers {

	
	public static void main(String[] args) {
		System.out.println(" String to int");
		
		String str1 = "2147483648";
		int i = Integer.MAX_VALUE;
		long l = Long.MAX_VALUE;
		
		l = Long.parseLong(str1);
	//	i = Integer.parseInt(str1);
		
		System.out.println(i);
		System.out.println(l);
		
		
	}
}
