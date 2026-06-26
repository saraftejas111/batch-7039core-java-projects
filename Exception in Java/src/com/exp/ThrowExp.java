package com.exp;

public class ThrowExp {
	
	public static void main(String[] args) {
		
		int age = 2 ; 
		
		
		if (age >= 18) {
			
			System.out.println("eligible for voting..");		
			
		} else {

			System.out.println("not eligible...");
			
			 throw new InvalidAge("please enter a valid age..");
						
		}
		
		// ------ 1000 lines logic .....
		
		System.out.println("voting done......");
		
		
		
	}

}
