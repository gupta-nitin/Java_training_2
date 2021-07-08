package com.examples;

public class StaticFunctionExample {

	public static void main(String[] args) {
		
		
		DataB.printAllProperties();
		DataB obj1= new DataB();
		obj1.printId();
		obj1.printValue();
		obj1.printAllProperties();
	}

}

class DataB {

	static int id;
	int value;

	public void printValue() {
		System.out.println("Value is = " + value);
	}

	public static void printId() {
		System.out.println("Id pis = " + id);
	}
	
	public static void printAllProperties(){
		System.out.println("Id pis = " + id);
		
	}

}
