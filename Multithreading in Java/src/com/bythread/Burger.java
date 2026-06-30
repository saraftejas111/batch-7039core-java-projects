package com.bythread;

public class Burger extends Thread {

	@Override
	public void run() {
		orderBurger();
	}

	private void orderBurger() {
		System.out.println("Burger order recieved.");
		System.out.println("Burger order is being prepared..");
		System.out.println("Burger order is completed...");
		System.out.println("Burger order is served....");
	}
}
