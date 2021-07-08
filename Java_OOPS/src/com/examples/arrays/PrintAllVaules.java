package com.examples.arrays;

public class PrintAllVaules {

	
	public static void main(String[] args) {
		
		int[] arr = {45, 887, 4 , 12 , 30};
		
		System.out.println("PRINT USING INDEXING for-loop");
		
		for(int i = 0; i < arr.length - 1; i++){
			
			System.out.println("value at "+ i + " index is = "+ arr[i]);
		}
		
		System.out.println("PRINT USING ehanced for loop");
		
		for(int value : arr){
			System.out.println("value is = "+ value);
		}
		
	}
	
}
