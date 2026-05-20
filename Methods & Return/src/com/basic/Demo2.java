package com.basic;

public class Demo2 {

	void areaOfCircumference(double radius) {

		// formula = (2 * pi) * radius ;
		
		Demo1 d = new Demo1() ; 

		double pi = d.calculationOfPI();

		double area = (2 * pi) * radius;

		System.out.println("Area Of Circumference = " + area);

	}
}
