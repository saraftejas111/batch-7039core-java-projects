package com.am1;

public class TestCar {


	public static void main(String[] args) {

		Car c = new Car();

		// c.privateM1();
		c.defaultM1();
		c.protectedM1();
		c.publicM1();
	}

}


// same package - different class : 

// private will not work, rest all will work 
// private will show compile time error