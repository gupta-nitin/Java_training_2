package com.examples;

public class DataTypeImplicitConverstion {

	public static void main(String[] args) {
		
		int i = 20;
		long l = 50l;
		
		System.out.println("Value of i : " + i );
		System.out.println("Value of l : " + l);
		
		l = i;
		
		System.out.println("After conversion l : "+l);
		
		char ch_1 = 'A';
		char ch_2 = 'B';
		
		i = ch_1;
		
		System.out.println("After implicit conversion i : "+i);
		
	
		
	}
	
}
