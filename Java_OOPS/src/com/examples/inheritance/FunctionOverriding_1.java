package com.examples.inheritance;

public class FunctionOverriding_1 {

	public static void main(String[] args) {
		
		Bike  b = new Bike();
		b.run();
		
	}
	
}

class Bike extends PertrolVehicle{
	
	public void run(){
		System.out.println("Run method of Bike");
		super.run();
		super.i = 100;
	}
	
}

class PertrolVehicle extends Vehicle{
	int i;
	public void run(){
		System.out.println("Run method of PertrolVehicle");
	}
	
	
}


class Vehicle{
	
	public void run(){
		System.out.println("Run method of vehicle");
	}
	
	public void paint(){
		System.out.println("Paint method of vehicle");
	}
}

