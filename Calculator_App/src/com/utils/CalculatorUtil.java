package com.utils;

import java.util.Scanner;

public class CalculatorUtil {

	public void add(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter num1");
		int num1 = scanner.nextInt();
		System.out.println("Please enter num2");
		int num2 = scanner.nextInt();
		int sum = num1 +  num2;
		System.out.println("Addition of "+num1 +", "+num2 + " is = " + sum);
	}
	
	public void substract(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter num1");
		int num1 = scanner.nextInt();
		System.out.println("Please enter num2");
		int num2 = scanner.nextInt();
		int diff = num1 -  num2;
		System.out.println("Susbtraction of "+num1 +", "+num2 + " is = " + diff);	
	}
	
	public void muliply(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter num1");
		int num1 = scanner.nextInt();
		System.out.println("Please enter num2");
		int num2 = scanner.nextInt();
		int product = num1 * num2;
		System.out.println("Multiplication of "+num1 +", "+num2 + " is = " + product);	
	}
	
	public void divide(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter num1");
		float num1 = scanner.nextFloat();
		System.out.println("Please enter num2");
		float num2 = scanner.nextFloat();
		float div = num1 / num2;
		System.out.println("Division of "+num1 +", "+num2 + " is = " + div);	
	}
	
	public void percentage(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number");
		int num1 = scanner.nextInt();
		System.out.println("Please enter percentage");
		int percenatage = scanner.nextInt();
		float result = num1 * (percenatage/100);
		System.out.println("Percentage is =" + percenatage);
	}
	
	
}
