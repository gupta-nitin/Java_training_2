package com.examples.exceptions;
class Exception2
{
	public static void main(String args[])
	{
	     int a=10;
	     int b=5;
	     int c=5;
	     int x,y;

	     x=a/(b-c);
	     System.out.println("Division by zero");

	     y=a/(b+c);
	     System.out.println("y="+y);
	}
}

