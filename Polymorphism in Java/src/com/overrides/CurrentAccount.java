package com.overrides;

public class CurrentAccount extends BankAccount{

	@Override
	void withdraw() {
		
		System.out.println("no limit... ");
	}
}
