package com.examples;

class stdemo3 {

	int i, j;
	static int x;

	public static void main(String args[]) {

		stdemo3 d1 = new stdemo3();
		System.out.println(d1.i);  // 0
		d1.x = x + 1;   // x= 1
		stdemo3 d3 = new stdemo3();
		d3.x = d3.x + 1; // x = 2
		System.out.println(d1.x); // 2
		System.out.println(d1.i); // 0
		System.out.println(d3.i); // 0
		System.out.println(d3.x); // 2

	}

}
