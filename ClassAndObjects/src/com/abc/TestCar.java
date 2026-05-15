package com.abc;

public class TestCar {

	public static void main(String[] args) {

		Car c1 = new Car();

		c1.company = "Tata";
		c1.model = "Nexon";
		c1.maxSpeed = 200;

		System.out.println(c1.company);
		System.out.println(c1.model);
		System.out.println(c1.maxSpeed);

		System.out.println("----------------------------------");

		Car c2 = new Car();

		c2.company = "Mercedez";
		c2.model = "Benz";
		c2.maxSpeed = 1000;

		System.out.println(c2.company);
		System.out.println(c2.model);
		System.out.println(c2.maxSpeed);

	}
}
