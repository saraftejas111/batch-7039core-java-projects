package com.task;

public class MainClass {

	public static void main(String[] args) {
		// Create object of ATMCard
		ATMCard card = new ATMCard();
		// Simulate operations

		// Valid Scenarios
		card.withdraw(2000, 4321); // Valid withdraw
		card.credit(1000); // Valid credit
		card.showBalance(4321); // Valid balance inquiry
		card.changePin(4321, 5555); // Valid PIN change
		card.showCardDetails(5555, 999999); // Valid card details display

		// Invalid Scenarios
		
		System.out.println("\n// Invalid Scenarios");
		
		card.withdraw(-500, 5555); // Invalid amount
		card.withdraw(10000, 1234); // Wrong PIN
		card.credit(-100); // Invalid credit
		card.showBalance(1111); // Wrong PIN
		card.changePin(1111, 123); // Wrong old PIN or invalid new PIN
		card.showCardDetails(5555, 111111); // Wrong OTP

	}
}
