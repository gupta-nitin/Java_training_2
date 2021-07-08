package com.examples;

public class DataTypeExplicitConvertion {

	public static void main(String[] args) {
		System.out.println("Explicit Convertion");
		
		int i = 20; // min = -2147483648 , max = 2147483647
		long l = 2147483650l;
		
		System.out.println("Value of i : " + i );
		System.out.println("Value of l : " + l);
		
		i = (int) l ;
		
		System.out.println("Value of i after convertion: " + i );
	}
	
}
