package com.demo;

public class MethodReturn {

	// a block which is used too execute a piece of code

	// return -- 1) to return the value to the method

	// (method name will act as a variable)

	// 2) to terminate the method

	// why to do return ? to access the local logic or result of method

	int x = 30;

	int sum(int a, int b) {

		int c = a + b; // 1000 lines

		System.out.println("sum = " + c);

		return c;

	}

	void average(int p, int q) {
		
		int c = sum(p, q); // 1

		int avg = c / 2;

		System.out.println("Avg = " + avg);
	}

	public static void main(String[] args) {
		MethodReturn mr = new MethodReturn();

		//mr.sum(2, 4); // 6
		
		mr.average(5, 11);
	}
}
