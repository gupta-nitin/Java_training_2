package com.examples.exceptions;

public class ErrorExample {
	
	public static void main(String[] args) {
		try{
		recursiveMethod(10);
		}catch (StackOverflowError e) {
			System.out.println("Error occured");
		}
	}

	public static void recursiveMethod(int i) {
		while (i != 0) {
			i = i + 1;
			recursiveMethod(i);
		}
	}
}