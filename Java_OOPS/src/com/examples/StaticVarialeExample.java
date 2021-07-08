package com.examples;

public class StaticVarialeExample {

	public static void main(String[] args) {
		
		Data data_1 = new Data();
		
		System.out.println("Created 1st object of Data");
		System.out.println(data_1.value);
		System.out.println(data_1.id);
		
		System.out.println("Assigning values to 1st object of Data");
		data_1.value = 101;
		data_1.id= 2;

		System.out.println(data_1.value);
		System.out.println(data_1.id);
		
		
		Data data_2 = new Data();
		
		System.out.println("Created 2nd object of Data");
		System.out.println(data_2.value);
		System.out.println(data_2.id);
		
		

		data_1.id ++;
		Data.id++; // java recommended way
		
		
		data_1.value ++;
		
		data_2.value++;
		
		System.out.println("Data_2 id after increment is --> " + data_2.id);
		System.out.println("Data_2 vaue after increment is --> " + data_2.value);
	}

}

class Data {

	int value;
	static int id;


}