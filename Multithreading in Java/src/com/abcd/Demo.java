package com.abcd;

public class Demo {

	// can i write return keyword inside the void method ?

//	void m1() {
//		System.out.println("hello");
//
//		return;
//	}

	int a = m2();

	int m2() {
		System.out.println("m2 method");
		return 0;
	}

	public static void main(String[] args) {

		Demo d = new Demo();

//		try {
//			System.out.println("A");
//			System.exit(0);
//			return;
//		} finally {
//			System.out.println("B");
//		}

	}

}

// return : to return the value , to terminate the method