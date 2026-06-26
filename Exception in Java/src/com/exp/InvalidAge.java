package com.exp;

public class InvalidAge extends RuntimeException {
	
	

	public InvalidAge() {
		super();	
	}

	public InvalidAge(String message) {
		super(message);
	}
	
	
	

	// extends only Exception : it will create Compile Time Exception
	
	// extends RuntimeException : it will create Runtime Exception 
	
	// (no need to handle at compile time)
}
