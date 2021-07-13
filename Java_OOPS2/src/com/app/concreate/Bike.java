package com.app.concreate;

import com.app.ds.IPetrolViehicle;
import com.app.ds.IVehicle;

public class Bike implements IPetrolViehicle{

	public void run(){
		System.out.println("Run Bike");
	}
	
	public void paint(){
		
		System.out.println("Paint Bike");
	}
	
	public void display(){
		System.out.println("Hi From Bike");
	}
	
	public void gears(){
		System.out.println("4 -grears");
	}
	
	public void printType() {
		System.out.println("Peetrol Bike");
	}
}
