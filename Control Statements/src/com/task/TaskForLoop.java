package com.task;

public class TaskForLoop {

	public static void main(String[] args) {

		System.out.println("1. Print the sum of first 10 natural numbers");

		int sum = 0; // 55
		for (int i = 1; i <= 10; i++) {

			sum = sum + i;
		}

		System.out.println("ans = " + sum);

		System.out.println("\n2. Print the factorial of 5");

		int fact = 1;
		for (int i = 1; i <= 5; i++) {
			fact = fact * i ;
		}

		System.out.println("ans = " + fact);
		
		
	}
}
