package com.bank;

public class Chaining {
	
	// Constructor Overloading

	public Chaining() {
		System.out.println("No Arg Constructor");
	}
	
	public Chaining(int a) {
		this()  ; 
		System.out.println("int a Constructor");
	}

	public Chaining(String b) {
		this(123) ; 
		System.out.println("String b Constructor");
	}
	
	public Chaining(boolean c) {
		this("java") ; 
		System.out.println("boolean c Constructor");
	}
	
	public Chaining(double d) {
		this(false); 
		System.out.println("double d Constructor");
	}
	
	public static void main(String[] args) {
		Chaining chaining = new Chaining(123.456) ; 
	}
	
}
