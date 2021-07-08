package com.app;

class WrapperDemo1 {
	public static void main(String args[]) {
		int x = 13;
		Integer i1 = new Integer(x); // using new keyword
		Integer i2 = 10; // using literals
		System.out.println("Value of i1 " + i1);
		System.out.println("Value of i2 " + i2);
		int result =i1 + i2;
		System.out.println(result);
		
		int y = i1.intValue();
		y = y + 1;
		System.out.println(y);
	}
}
