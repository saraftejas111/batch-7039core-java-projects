package com.bythread;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Pizza p1 = new Pizza();

		Coffee c1 = new Coffee();

		Burger b1 = new Burger();

		System.out.println("Cafe is Open....\n");

		p1.start();
		c1.start();
		b1.start();

//		p1.join();
//		c1.join();
//		b1.join();

		System.out.println("\nCafe is Closed....");
	}
}
