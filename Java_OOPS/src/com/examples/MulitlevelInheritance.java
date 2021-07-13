package com.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MulitlevelInheritance {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put(null, "");
		map.put(null, "A");
		System.out.println(map);
		
		
		Honda honda = new Honda();
		
		
	}
	
}



class Honda extends Vechile_4Wheleer{
	
}


class Vechile_4Wheleer extends PetrolVechile{
	
}

class PetrolVechile{
	
}