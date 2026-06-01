package com.starpattern;

public class StarPatternPrograms {

	public static void main(String[] args) {

		System.out.println("1. Square Pattern");

		for (int r = 1; r <= 5; r++) {

			for (int c = 1; c <= 5; c++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		System.out.println("\n2. Triangle Pattern");

		for (int r = 1; r <= 5; r++) {

			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		System.out.println("\n3. Inverted Triangle Pattern");

		for (int r = 5; r >= 1; r--) {

			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		System.out.println("\n4. Hollow Square Pattern");

		for (int r = 1; r <= 5; r++) {

			for (int c = 1; c <= 5; c++) {

				if (r == 1 || r == 5 || c == 1 || c == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}
}
