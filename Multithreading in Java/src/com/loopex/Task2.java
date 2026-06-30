package com.loopex;

public class Task2 extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println("Task 2, name = " + currentThread().getName());
		}
	}
}
