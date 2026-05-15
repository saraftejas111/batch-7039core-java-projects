package com.dt;

public class TypeCasting {

	public static void main(String[] args) {
		
		// Implicit cating, Data Widening
		
		byte b = 10 ; 
		
		// b = b * 20 ;  // small size -- 127
		
		int a = b ; 
		
		a = a * 20 ; 
		
		System.out.println(a);
		
		double d = a ;  // big
		
		
		
		// Explicit casting, Data Narrowing
		
		double dd = 1234567845.234234 ; 
		
		float f = (float) dd ; 
		
		System.out.println("double to float = "+f);
		
		int ii = (int) dd ; 
		
		System.out.println("double to int = "+ii);
		
		
		
		
		
		
		
		
		
	}
}
