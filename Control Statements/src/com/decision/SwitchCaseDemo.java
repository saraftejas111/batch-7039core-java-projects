package com.decision;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		String str = "D" ; 
		
		switch (str) {
		case "A":
			System.out.println("One");
			break;

		case "B":
			System.out.println("Two");
			break;

		case "C":
			System.out.println("Three");
			break;

		default:
			System.out.println("case not available");
			break;
		}

	}
}
