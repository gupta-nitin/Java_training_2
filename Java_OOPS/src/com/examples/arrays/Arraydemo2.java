package com.examples.arrays;

class Arraydemo2 {
	public static void main(String args[]) {
		
		int i[] = { 12, 33, 50, 30, 45 }; // 
		System.out.println("Value of i[0] = " + i[0]);
		System.out.println("Value of i[1] = " + i[1]);
		System.out.println("Value of i[2] = " + i[2]);
		System.out.println("Value of i[3] = " + i[3]);
		System.out.println("Value of i[4] = " + i[4]);
		
		System.out.println("Last Index value of array = " + i[i.length-1]);
		
		char ch[] = { 'e', 'x', 'a', 'm', 'p', 'l', 'e' };
		System.out.println(ch);
		System.out.println(ch[ch.length-1]);
	}
}
