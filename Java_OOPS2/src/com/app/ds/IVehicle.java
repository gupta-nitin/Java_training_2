package com.app.ds;

public interface IVehicle {
	
	public void run();
	
	public void paint();
	
	// In Java-8 Default Method and Static Method is introduced
	
	public default void display(){
		System.out.println("Hi from IVehicle");
	}
	
}
