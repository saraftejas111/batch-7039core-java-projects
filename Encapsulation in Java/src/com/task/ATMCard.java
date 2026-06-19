package com.task;

public class ATMCard {
	// Private fields (pre-initialized)
	private String cardNumber = "1234-5678-9012-3456";
	private String cardHolder = "Amit Sharma";
	private int cvv = 321;
	private int pin = 4321;
	private double balance = 15000.0;
	private final int otp = 999999;

	// Withdraw money with PIN check
	public void withdraw(double amount, int enteredPin) {

		if (enteredPin == pin) {

			if (amount > 0) {
				if (balance > amount) {
					balance -= amount;
					System.out.println("withdraw of " + amount + "rs is success..\ncurrent balance = " + balance);
				} else {
					System.out.println("Insuffient Funds");
				}
			} else {
				System.out.println("invalid amount");
			}

		} else {
			System.out.println("incorrect pin ");
		}
	}

	// Credit amount to account
	public void credit(double amount) {

		if (amount > 0) {
			balance += amount;

			System.out.println(amount + " rs credited success..\ncurrrent balance = " + balance);
		} else {
			System.out.println("invalid amount");
		}
	}

	// Show balance with PIN check
	public void showBalance(int enteredPin) {
		if (enteredPin == pin) {
			System.out.println("Balance = " + balance);
		} else {
			System.out.println("incorrect pin ");

		}
	}

	// Change PIN securely
	public void changePin(int oldPin, int newPin) {

		if (oldPin == pin) {
			pin = newPin;
			System.out.println("new pin set successfully...");
		} else {
			System.out.println("invalid old pin");
		}
	}

	// Show cardholder details with PIN and OTP
	public void showCardDetails(int enteredPin, int enteredOtp) {
		if (enteredPin == pin) {

			if (enteredOtp == otp) {
				System.out.println("--- Card Details ---");
				System.out.println("Card Number : " + cardNumber);
				System.out.println("Card Holder Name : " + cardHolder);
				System.out.println("CVV : " + cvv);
				System.out.println("Pin : " + pin);
				System.out.println("Balance : " + balance);
			} else {
				System.out.println("incorrect opt");
			}

		} else {
			System.out.println("invalid pin");
		}
	}
}
