package com.app.ds;

public class Person {

	
	 protected String name;
	 private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	 protected void print(){
		System.out.println(name);
		System.out.println(age);
	}
	
	
}
