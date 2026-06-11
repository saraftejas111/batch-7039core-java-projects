package com.bank;

public class Account {

	int adhaarId;
	String fullName;
	String pancard;
	double balance;
	String email = "Not Provided";
	String city = "Not mentioned";
	String nominee = "No Nominee Defined";

	Account(int adhaarId, String fullName, String pancard, double balance) {

		this.adhaarId = adhaarId;
		this.fullName = fullName;
		this.pancard = pancard;
		this.balance = balance;
	}

	Account(int adhaarId, String fullName, String pancard, double balance, String email) {

		this(adhaarId, fullName, pancard, balance);
		// this() constructor is always called on 1st line only

		this.email = email;

	}

	Account(int adhaarId, String fullName, String pancard, double balance, String email, String city) {

		this(adhaarId, fullName, pancard, balance, email);
		this.city = city;
	}

	Account(int adhaarId, String fullName, String pancard, double balance, String email, String city, String nominee) {

		this(adhaarId, fullName, pancard, balance, email, city);
		this.nominee = nominee;
	}

	void displayInfo() {
		System.out.println("Adhaar ID = " + adhaarId);
		System.out.println("Full Name = " + fullName);
		System.out.println("Pancard = " + pancard);
		System.out.println("Balance = " + balance);
		System.out.println("Email = " + email);
		System.out.println("City = " + city);
		System.out.println("Nominee = " + nominee);

	}

	// no default constructor
}
