package com.basic;

public class Demo1 {

	double calculationOfPI() {

		// ...... 2000 lines code

		double result = 3.142123123;

		System.out.println("value of pi = " + result);

		return result;

	}

	void areaOfCircle(double radius) {

		// formula = pi * (radius * radius) ;

		double pi = calculationOfPI();

		double area = pi * (radius * radius);

		System.out.println("Area Of Circle = " + area);

	}
}
