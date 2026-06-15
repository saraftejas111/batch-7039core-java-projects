package com.am2;

import com.am1.Car;

public class HelloCar extends Car {

	public static void main(String[] args) {

		Car c = new Car();

		HelloCar hc = new HelloCar();

		// c.privateM1();
		// c.defaultM1();
		hc.protectedM1();
		c.publicM1();
	}

}

// different package - different class : 

// private will not work
// default will not work
// protected will need the object of child class

// public will get access all over the project.. 