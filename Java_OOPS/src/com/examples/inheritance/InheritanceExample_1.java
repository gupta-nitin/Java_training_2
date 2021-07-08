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
		
/*		Employee e = new Employee();
		e.name = "XYZ";
		e.age = 56;
		e.address = "India";
		e.salary = 52000;
		e.desigantion = "Manager";*/
		
	}

}

class Student extends Person{

	int marks;
	String subjects;
	
	public Student(){
		super("default-name");
		System.out.println("Student class consutructor executed...");
	}
	
	public int getMarks(){
		
		return marks;
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
		System.out.println("Person class parmeterized constructor executed....");
	}
	
}


class Employee extends Person {
	
	int salary;
	String desigantion;
	
	
	public Employee() {
		System.out.println("Employee class constructor is called");
	}
}



