package com.looping;

public class OddEven {

	public static void main(String[] args) {

		// 1. find odd even nums bet 10 to 0
		System.out.println("1. find odd even nums bet 10 to 0\n");
		for (int i = 10; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.println(i + " even");
			} else {
				System.out.println(i + " odd");

			}
		}

		// 2. find odd even count bet 10 to 0
		System.out.println("\n2. find odd even count bet 10 to 0\n");

		int evencount = 0;
		int oddcount = 0;

		for (int i = 0; i <= 10; i++) {

			if (i % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}
		}
		
		System.out.println("Even nums = "+evencount);
		System.out.println("Odd nums = "+oddcount);

	}
}
