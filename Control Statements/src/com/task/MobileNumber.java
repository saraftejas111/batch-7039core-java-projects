package com.task;

import java.util.Scanner;

public class MobileNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ; 
		
		System.out.println("Enter 6 digit Mob Num : ");
		
		int digit = sc.nextInt() ; 
		
		int count = 0 ; 
		
		while (digit > 0) {
			
			count++ ; 
			
			digit/=10 ; 
		}
		
//		for(int i = digit ; i > 0 ; i/=10) {			
//			count++ ;			
//		}
		
		if (count == 6 ) {
			System.out.println("valid mobile number");
		} else {
			System.out.println("invalid mobile number");

		}
	}
}
