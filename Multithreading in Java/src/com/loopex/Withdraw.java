package com.loopex;

public class Withdraw extends Thread {

	Account ac;

	public Withdraw(Account ac) {
		super();
		this.ac = ac;
	}

	@Override
	public synchronized void run() {

		for (int i = 1; i <= 200; i++) {

			ac.withdraw();
		}
	}

	int getBalance() {
		return ac.balance;
	}
}
