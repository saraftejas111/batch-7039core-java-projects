package com.loopex;

public class Account {

	int balance = 1000;

	public synchronized void deposit() {
		balance++;

	}

	public synchronized void withdraw() {
		balance--;

	}

}
