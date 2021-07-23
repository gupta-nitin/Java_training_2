package com.examples.thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SingleThreadExample {

	public static void main(String[] args) {
		System.out.println("----------Start------------");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		System.out.println(dtf.format(LocalDateTime.now()));  
		int num1 = 100;
		int num2 = 20;
		
		add(num1, num2);
		divide(num1, num2);
		substract(num1, num2);
		multiply(num1, num2);
		
		
		System.out.println(dtf.format(LocalDateTime.now())); 
		System.out.println("----------End------------");
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
	
	private static void divide(int num1, int num2) {
		int result = num1 / num2;
		System.out.println("Qutionent is : " + result );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
