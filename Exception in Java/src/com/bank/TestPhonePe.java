package com.bank;

public class TestPhonePe {

	public static void main(String[] args) throws InvalidPin, InterruptedException {
		
		PhonePe p = new PhonePe();
		
		p.doPayment(20000, 1234);
		
		
	}
}
