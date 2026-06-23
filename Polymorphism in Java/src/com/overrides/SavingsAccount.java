package com.overrides;

public class SavingsAccount extends BankAccount{

	@Override
	void withdraw() {
		System.out.println("1 lakh limit / day");
	}
}
