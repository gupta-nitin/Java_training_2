package com.examples.thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MultiThreadExample {

	public static void main(String[] args) {
		System.out.println("----------Start------------");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		System.out.println(dtf.format(LocalDateTime.now()));  
		int num1 = 100;
		int num2 = 20;
		
		
		AddThread add = new AddThread(num1, num2);
		DivideThread divide = new DivideThread(num1, num2);
		MultiplyThread multiply = new MultiplyThread(num1, num2);
		SubstractThread substract = new SubstractThread(num1, num2);
		
		add.start();
		divide.start();
		multiply.start();
		substract.start();
		
		System.out.println(dtf.format(LocalDateTime.now())); 
		System.out.println("----------End------------");
	}

}

class AddThread extends Thread{

	int num1, num2 ;
	
	public AddThread(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void run(){
		add(num1, num2);
	}
	
	private static void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("SUm is : " + result );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class DivideThread extends Thread{

	int num1, num2 ;
	
	public DivideThread(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void run(){
		divide(num1, num2);
	}
	
	private static void divide(int num1, int num2) {
		int result = num1 / num2;
		System.out.println("Qutionent is : " + result );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

class MultiplyThread extends Thread{

	int num1, num2 ;
	
	public MultiplyThread(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void run(){
		multiply(num1, num2);
	}
	private static void multiply(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("Product is : " + result );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

class SubstractThread extends Thread{

	int num1, num2 ;
	
	public SubstractThread(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void run(){
		substract(num1, num2);
	}

	private static void substract(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("Difference is : " + result );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
