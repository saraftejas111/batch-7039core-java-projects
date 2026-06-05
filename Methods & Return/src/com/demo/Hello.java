package com.demo;

public class Hello {

	int a = 10; // global variables

	public void m1() {

		int b = 2; // local variables

		System.out.println("b = " + b);

	}

	public static void main(String[] args) {
		Hello h = new Hello();

		System.out.println(h.a);
		
		

	}
}

// method ? --> code reusability