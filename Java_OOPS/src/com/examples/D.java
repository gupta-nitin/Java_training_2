package com.examples;

public class D {

	int i = 0; // global variable
	int j = 1; // global variable

	void funD() {
		System.out.println("hi");
	}

}

class Demo9 {

	void fun1(D d) {

		System.out.println(d);

		if (d != null) {
			d.i = d.i + d.j;
			System.out.println(d.i);
		}

		System.out.println("End of function");
	}

	public static void main(String args[]) {
		Demo9 d1 = new Demo9();
		
		D d_object_1 = new D();
		
		d_object_1.i = 2;
		d_object_1.j = 3;
		
		d1.fun1(d_object_1);
		
		D d_object_2 = new D();
		
		d1.fun1(d_object_2);

	}
}
