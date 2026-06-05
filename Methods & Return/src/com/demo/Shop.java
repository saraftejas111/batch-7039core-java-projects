package com.demo;

public class Shop {

	double gst(double amount) {

		return amount * 0.10;
	}

	double totalBill(double amount) {

		double gst = gst(amount);
		double total = amount + gst;

		return total;
	}

	void enterAmount(double amount) {

		System.out.println("Your actual amount = " + amount);
		System.out.println("Your gst amount = " + gst(amount));
		System.out.println("Your total amount = " + totalBill(amount));

	}

	public static void main(String[] args) {
		
		Shop customer1 = new Shop();
		
		customer1.enterAmount(1000);
	}
}
