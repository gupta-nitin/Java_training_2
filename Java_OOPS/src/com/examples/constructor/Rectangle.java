package com.examples.constructor;

class Rectangle {
	int length, width;

	Rectangle(int x, int y) {
		length = x;
		width = y;
		System.out.println(x/y);
	}
	
	
	int rectArea() {
		return (length * width);
	}

	public static void main(String args[]) {

		Rectangle rect1 = new Rectangle(15, 0);
		int area = rect1.rectArea();
		System.out.println("Area = " + area);

	}
}
