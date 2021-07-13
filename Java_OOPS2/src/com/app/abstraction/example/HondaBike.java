package com.app.abstraction.example;

public class HondaBike extends Bike{

	@Override
	public void run() {
		System.out.println("Implementing abstract method of Abstract CLass - Bike");
	}
	
	
	public static void main(String[] args) {
		Bike bike = new HondaBike();
		bike.run();
		bike.normalMethod();
	}

}

abstract class Bike {

	public abstract void run();

	public void normalMethod() {
		System.out.println("NorMal Method");
	}

}
