package com.bank;

public class TestBank {

	public static void main(String[] args) {

		Account raj = new Account(123, "Raj Dev", "rd123", 5000);
		raj.displayInfo();
		System.out.println("\n");

		Account neha = new Account(456, "Neha Pradhan", "np123", 7000 , "neha@gmail.com");
		neha.displayInfo();
		System.out.println("\n");

		Account jay = new Account(789, "Jay Patel", "jp123", 6000 , "jay@tka.com" , "Pune"); 
		jay.displayInfo();
		System.out.println("\n");


		Account tejas = new Account(222, "Tejas Saraf", "ts123", 4000 , "tejas@gmail.com" , "Pune" , "Karan") ; 
		tejas.displayInfo();
	}
}
