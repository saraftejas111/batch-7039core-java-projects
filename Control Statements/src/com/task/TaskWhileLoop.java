package com.task;

public class TaskWhileLoop {

	public static void main(String[] args) {

		System.out.println("1. Print the sum of first 10 natural numbers");

		int sum = 0;
		int i = 10;
		while (i > 0) {
			sum = sum + i;
			i--;
		}
		System.out.println("ans = " + sum);

		System.out.println("\n2. Print the factorial of 5");

		int fact = 1;
		int j = 5;
		while (j > 0) {
			fact = fact * j;
			j--;
		}

		System.out.println("ans = " + fact);
	}
}
