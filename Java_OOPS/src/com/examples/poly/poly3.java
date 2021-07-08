package com.examples.poly;

class poly3 {
	
	void fun1(long x) {
		System.out.println("accept only long value");
	}
	/*
	 * void fun1(int x) { System.out.println("fun1 accept only int value"); }
	 */

	void fun1(float x, float y) {
		System.out.println("fun1 accept only float value");

	}
	
	void fun1(int x, float y) {
		System.out.println("fun1 accept only int x, float y");

	}

	public static void main(String args[]) {
		poly3 p2 = new poly3();
		int i = 6;
		long j = 6;

		p2.fun1(i, j);
	}
}
