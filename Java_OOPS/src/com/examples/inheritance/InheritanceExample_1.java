package com.examples.inheritance;

public class InheritanceExample_1 {
	
	public static void main(String[] args) {
		System.out.println("Inheritance Example");
		
		Student p = new Student();
		p.name = "ABC";
		p.age = 45;
		p.address = "India";
		p.marks = 58;;
		p.subjects = "PCM";
		
	}

}

class Student extends Person{

	int marks;
	String subjects;
	
	public Student(){
		super("asbc");
		System.out.println("Student class consutructor executed...");
	}
}


class Person{
	
	String name;
	int age;
	String address;
	
	public Person(){
		System.out.println("Person class constructor executed....");
	}
	
	public Person(String name){
		this.name = name;
		System.out.println("Person class constructor executed....");
	}
	
}


class Employee extends Person {
	
	int salary;
	String desigantion;
	
}



