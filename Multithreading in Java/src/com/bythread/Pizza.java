package com.bythread;

public class Pizza extends Thread {

	@Override
	public void run() {
		orderPizza();
	}

	private void orderPizza() {
		System.out.println("Pizza order recieved.");
		System.out.println("Pizza order is being prepared..");
		System.out.println("Pizza order is completed...");
		System.out.println("Pizza order is served....");
	}
}
