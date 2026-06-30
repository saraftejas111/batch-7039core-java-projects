package com.loopex;

public class Deposit extends Thread {

	Account ac;

	public Deposit(Account ac) {
		super();
		this.ac = ac;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 500; i++) {

			ac.deposit();
		}
	}

}
