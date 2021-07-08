package com.examples;

public class FinalMethodExample {
	
	public static void main(String[] args) {
		
		Bike bike = new Bike();
		bike.paint();
		 
		
		
	}

}




final class Bike extends DarkEditionVechile{
	
	
}

class DarkEditionVechile{
	
	public final void paint(){
		System.out.println("Paint method of DarkEditionVechile - Black");
	}
	
}



class Vechile{
	
	public void run(){
		System.out.println("Run method of Vechile");
	}
	
	public void paint(){
		System.out.println("Paint method of Vechile - Basic White");
	}
	
}
