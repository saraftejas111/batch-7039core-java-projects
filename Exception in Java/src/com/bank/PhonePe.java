package com.bank;

public class PhonePe {

	private double balance = 5000;

	public void doPayment(double amount, int pin) throws InvalidPin, InterruptedException  {

		if (pin == 1234) {

			if (amount <= balance) {

				System.out.println("payment processing....");
				Thread.sleep(2000);

			} else {
				System.out.println("insufficient funds..");
				
				throw new InsuffientFunds("itne paise nahi hain..") ; 
			
			}
		} else {

			System.out.println("invalid pin..");
			
			throw new InvalidPin("galat pin enter kiya hain");
		}


		System.out.println("connect to own bank server...   500 lines");
		Thread.sleep(2000);
		System.out.println("connect to recievers bank server... 500 lines ");
		Thread.sleep(2000);
		System.out.println("paymeny done successfully.. ...");

	}

}
