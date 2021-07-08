package com.examples;


public class Demo10 {
	
	public static void main(String args[]) {
	
		DataC.b1.i = 3;
		DataC.b1.printB();
		
		System.out.println("Hello !!!!");

	}
	
}

class DataC {

	static int x = 13;
	static B b1 = new B();

}


class B {

	int i, j;

	void printB() {

		System.out.println("PrintB()");
	}

}
