package com.examples.constructor;

class Tdemo1 {
	int i, j; // global 

	void funt(int i) {
		this.i = i + 1;
		j = j + 1;
	}

	public static void main(String args[]) {
		Tdemo1 d1 = new Tdemo1();
		d1.funt(5);
		
		System.out.println(d1.i);
		System.out.println(d1.j);
		
		Tdemo1 d2 = new Tdemo1();
		d2.funt(10);
		
		System.out.println(d2.i);
		System.out.println(d2.j);
	}
}
