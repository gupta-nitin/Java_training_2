package com.examples;

public class ObjectCounterExample {

	public static void main(String[] args) {
		DataA obj = null;
		obj = new DataA();
		obj = new DataA();
		obj = new DataA();
		obj = new DataA();
		obj = new DataA();
		obj = new DataA();
		obj = new DataA();
		obj = new DataA();
		obj = new DataA();
		obj = new DataA();
		obj = new DataA();
		System.out.println("No of Objects of DataA is = "+ obj.object_count);
	
	}
	
}


class DataA{
  
	
	static int object_count;
	int value;
	
	public DataA() {
		object_count++;
	}
	
}
