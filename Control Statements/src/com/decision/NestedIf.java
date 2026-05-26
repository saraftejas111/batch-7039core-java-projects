package com.decision;

public class NestedIf {

	public static void main(String[] args) {

		// voting app :

		int age = 18;

		if (age > 0 && age < 110) {

			System.out.println("valid age...");

			if (age >= 18) {
				System.out.println("Eligible for Voting");
			} else {
				System.out.println("Not Eligible for Voting");

			}

		} else {
			System.out.println("invalid age...");
		}

	}
}
