package com.am1;

public class Car {

	private void privateM1() {

		System.out.println("private - M1");
	}

	void defaultM1() {
		System.out.println("default - M1");
	}

	protected void protectedM1() {
		System.out.println("protected - M1");
	}

	public void publicM1() {
		System.out.println("public - M1");
	}

	public static void main(String[] args) {

		Car c = new Car();

		c.privateM1();
		c.defaultM1();
		c.protectedM1();
		c.publicM1();
	}

}


// same package - same class :   all will work 
