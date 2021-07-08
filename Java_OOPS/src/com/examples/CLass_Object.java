package com.examples;

public class CLass_Object {

	
	
	public static void main(String[] args) {
		
		Calc calc1 = new  Calc();
		
		CalcData calcData_1 = new CalcData(10, 20);
		CalcData calcData_2 = new CalcData(20, 30);
		CalcData calcData_3 = new CalcData(50, 30);
		
		System.out.println(calc1.add(calcData_1));
		System.out.println(calc1.add(calcData_2));
		System.out.println(calc1.add(calcData_3));
		
	}
	
}


class Calc{
	
//	public int add(int num1, int num2)
	
	public int add(CalcData calcData){
		
		return calcData.num1 + calcData.num2;
	}
	
}

class CalcData{
	
	int num1;
	int num2;
	public CalcData(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	
}