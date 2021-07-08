package com.examples;

class odemo7 {
	void fun1(int x) {
		int square = x * x;
		System.out.println(square);
	}

	public static void main(String args[]) {
		odemo7 d1 = new odemo7();
		d1.fun1(6);
		int i = 6;
		d1.fun1(i);
	}
}
