package com.apps;

import java.util.Scanner;

import com.utils.CalculatorUtil;

public class CalculatorApp {

	public static void main(String[] args) {
		CalculatorApp app = new CalculatorApp();
		int selection = 0 ;
		do{
			selection = app.printMenu();
			CalculatorUtil util = new CalculatorUtil();
		
		switch (selection) {
		
		case 1:
			util.add();
			break;
		case 2:
			util.substract();
			break;
		case 3:
			util.muliply();
			break;
		case 4:
			util.divide();
			break;
		case 5:
			util.percentage();
			break;
		case 6:
			System.out.println("Terminating.....");
			break;
		default:
			System.out.println("Invalid selection");
		}

		}while(selection!=6);
		
		
	}

	private int printMenu() {
		int selection = 0;
		System.out.println("------------Calculator Application------------");
		System.out.println("1) Add");
		System.out.println("2) Substract");
		System.out.println("3) Multiply");
		System.out.println("4) Divide");
		System.out.println("5) Pecentage");
		System.out.println("6) Quit");
		System.out.println("Please enter your selection");
		Scanner input = new Scanner(System.in);
		selection = input.nextInt();
		return selection;

	}

}
