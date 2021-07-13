package com.app.abstraction.example;

class ademo2 {
	
	
	public static void main(String[] args) {
		TwoStrokeEngineCar car = new HondaCar();
		car.run();
		car.addInfoSystem();
		car.addAC();
		car.paint();
	}
}


class HondaCar extends TwoStrokeEngineCar{
	
	@Override
	public void paint() {
		System.out.println("Black");
	}
	
}


abstract class TwoStrokeEngineCar implements IVehicle,ILuxuary {
	
	public void run(){
		System.out.println("Runs on 2 stroke engine");
	}
	
	@Override
	public void addAC() {
		System.out.println("Installed AC");
	}	
	
	
	@Override
	public void addInfoSystem() {
		System.out.println("Installed INfosystem");
	}
}


interface IVehicle{
	
	public void run();
	public void paint();
}

interface ILuxuary{

	public void addAC();
	
	public void addInfoSystem();
}

