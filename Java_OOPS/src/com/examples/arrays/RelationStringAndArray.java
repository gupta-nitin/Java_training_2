package com.examples.arrays;

public class RelationStringAndArray {

	public static void main(String[] args) {

		String str = "abc"; // char[] ch = {a,b,c};

		System.out.println("Value of str is = " + str);

		System.out.println("String index = 1, value = " + str.charAt(1));
		
		char[] ch = str.toCharArray();
		
		System.out.println("value of char array reutren by STring str is = ");
		System.out.println(ch);
		
		ch[1] = 'x';
		System.out.println("ch[1] = " + ch[1]);
		System.out.println(ch);
		System.out.println("Value of actual String str : "+ str);
		
	}

}
