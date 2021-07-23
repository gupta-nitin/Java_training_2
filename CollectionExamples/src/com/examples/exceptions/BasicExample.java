package com.examples.exceptions;

import java.util.Scanner;

public class BasicExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		try {

			int dresult = num1 / num2; // 5 sec // Thread 1
			
			int aresult = num1 + num2;  // 5 sec // Thread 2
			
			int mresult = num1 * num2; // 5 sec // Thread 3
			
			int sresult = num1 - num2; // 5 sec // Thread 4
			
			System.out.println("Division Result of " + num1 + "/" + num2 + " is = " + dresult);

		} catch (ArithmeticException e) {

			System.out.println("Cannot divide by  zero.");
		}

		System.out.println("Program executed sucessfully....");
	}

}
