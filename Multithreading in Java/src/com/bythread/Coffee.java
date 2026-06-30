package com.bythread;

public class Coffee extends Thread {

	@Override
	public void run() {
		orderCoffee();
	}

	private void orderCoffee() {
		System.out.println("Coffee order recieved.");
		System.out.println("Coffee order is being prepared..");
		System.out.println("Coffee order is completed...");
		System.out.println("Coffee order is served....");
	}
}
