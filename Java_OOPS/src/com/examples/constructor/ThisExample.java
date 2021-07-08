package com.examples.constructor;

public class ThisExample {

	public static void main(String[] args) {

		Data data_object1 = new Data();
		data_object1.value = 55;
		System.out.println("Future Value : " + data_object1.getFutureValue());
		
		Data data_object2 = new Data();
		data_object2.value = 35;
		System.out.println("Future Value : " + data_object2.getFutureValue());

	}

}

class Data {

	int value; // global

	int getFutureValue() {
		int value = 10;  // local 
		System.out.println("Calculating Future Value");
		int result = value  * this.value;
		return result;
	}

}