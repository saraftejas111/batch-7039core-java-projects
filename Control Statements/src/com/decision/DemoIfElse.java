package com.decision;

public class DemoIfElse {

	public static void main(String[] args) {

		int age = 15;

		if (age >= 18) {
			System.out.println("Age is valid for voting");
		} else {
			System.out.println("Invalid Age for voting");

		}
		
		
		int num = 17 ; 
		
		if (num % 2 == 0) {
			System.out.println(num+" is even");
		} else {
			System.out.println(num+" is odd");

		}

	}
}
