package com.examples.arrays;

public class ArrayExample {

	public static void main(String[] args) {

		int i[] = new int[4]; // Syntax to create array object

		i[2] = 10;

		i[0] = 20;

		System.out.println("Value of i[0] = " + i[0]);
		System.out.println("Value of i[1] = " + i[1]);
		System.out.println("Value of i[2] = " + i[2]);
		System.out.println("Value of i[3] = " + i[3]);

		float k[] = new float[3];
		System.out.println(k[0]);
		k[1] = 12.9f;
		k[2] = 8;
		System.out.println(k[1]);
		System.out.println(k[2]);

		char ch[] = new char[4];
		System.out.println(ch[0]);
		ch[1] = 'j';
		ch[2] = 'a';
		System.out.println(ch[1]);
	}

}
