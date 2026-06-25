package com.overrides;

public class UPI  extends Payment {

	@Override
	void doPayment() {	
		super.doPayment();
		System.out.println("payment done by UPI");
	}
}
