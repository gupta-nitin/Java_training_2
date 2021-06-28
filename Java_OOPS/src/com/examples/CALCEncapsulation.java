package com.examples;

public class CALCEncapsulation {

	private int num1;
	private int num2;
	
	public CALCEncapsulation(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int add(){
		return num1+num2;
	}
	
}
