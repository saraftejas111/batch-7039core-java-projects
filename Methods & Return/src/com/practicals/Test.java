package com.practicals;

public class Test {

	public static void main(String[] args) {

		// 5 , 3

		Calculator c1 = new Calculator();

		int result1 = c1.sum(5, 3);

		System.out.println("Sum = " + result1);
		
		
		Calculator c2 = new Calculator();
		
		double result2 = c2.multiply(5.534, 4.426) ;
		
		System.out.println("multiply = "+result2);
		
		
		Calculator c3 = new Calculator() ; 
		
		float result3 = c3.division(12.5f, 5.3f) ; 
		
		System.out.println("Div = "+result3);
		
		

	}
}
