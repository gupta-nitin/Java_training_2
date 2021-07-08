package com.examples.constructor;

public class ConstrctExample1 {

	public static void main(String[] args) {
		new Student();
		new Student();
		new Student();
		new Student();
	}
	
	public void printHello(){
		System.out.println("Hllo....");
	}
}


class Student{
	
	int name;
	String age;
	
	public Student(){
		System.out.println("Object Created");
	}
	
}