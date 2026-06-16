package com.demo;

public class Account {

	private int accno;
	private String name;
	private double balance;
	private int pin = 1234;

	public void pinChange(int oldPin, int newPin) {

		if (oldPin == pin) {
			pin = newPin;
			System.out.println("New Pin Set Successfully..");
			
		} else {
			System.out.println("Invalid old Pin");
		}
	}

	public Account(int accno, String name, double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance(int pin) {
		if (this.pin == pin) {
			return balance;
		} else {
			return 0;
		}
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
