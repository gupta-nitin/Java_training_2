package com.examples.exceptions;

class error3 {
	public static void main(String args[])

	{
		int a[] = { 10, 5 };
		Integer b = 2;

		try {
			int x = a[0] / (b - a[1]);
			
		} catch (ArithmeticException e) {
			
			System.out.println(" ArithmeticException occure i.e. Division by zero");
		
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException i.e. accessing an invalid index of array");
			
		}catch(Exception e){
			System.out.println("Something went wrong...");
		}
		finally {
			System.out.println("BYe Bye");
		}
		
	}
}
