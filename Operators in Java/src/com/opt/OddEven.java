package com.opt;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num to check Odd or Even : ");
		int num = sc.nextInt() ;
		
		// using ternary operator find odd or even 
		
		String check = ( num % 2 == 0 ) ? "Even Number" : "Odd Number" ; 
		
		System.out.println(num+" is "+check);
	}
}
