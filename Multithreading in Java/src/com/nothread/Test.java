package com.nothread;

public class Test {

	public static void main(String[] args) {

		Pizza p1 = new Pizza();

		Coffee c1 = new Coffee();

		Burger b1 = new Burger();
		
		p1.orderPizza();
		
		System.out.println("\n");
		
		c1.orderCoffee();
		
		System.out.println("\n");
		
		b1.orderBurger();
		
	}
}
