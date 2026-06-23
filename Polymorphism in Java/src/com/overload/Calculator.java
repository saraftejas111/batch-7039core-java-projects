package com.overload;

public class Calculator {

	void sum(int a, int b) {

		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	void sum(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}
}
