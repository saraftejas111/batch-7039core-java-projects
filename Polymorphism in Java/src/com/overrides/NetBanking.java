package com.overrides;

public class NetBanking extends Payment{

	@Override
	void doPayment() {
	
		System.out.println("payment done by NetBanking");
	}
}
