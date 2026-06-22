package com.task;

import java.util.Scanner;

public class UserMainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter 12 digit card number");
		String cardNumber = sc.next();

		sc.nextLine();

		System.out.println("enter name : ");

		String cardHolder = sc.nextLine();

		System.out.println("enter cvv : ");

		int cvv = sc.nextInt();
		System.out.println("enter pin : ");

		int pin = sc.nextInt();

		System.out.println("enter balance : ");

		double balance = sc.nextDouble();

		UserATMCard card = new UserATMCard(cardNumber, cardHolder, cvv, pin, balance);

		while(true) {
			System.out.println("\n1. withdraw");
			System.out.println("2. deposit");
			System.out.println("3. show balance");
			System.out.println("4. change pin");
			System.out.println("5. withdraw");
			System.out.println("6. exit");

			int op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("enter amount : ");

				double amount = sc.nextDouble();
				System.out.println("enter pin : ");
				int pinn = sc.nextInt();

				card.withdraw(amount, pinn);

				break;
				
			case 2:
				System.out.println("enter amount : ");

				double dipamount = sc.nextDouble();
				card.credit(dipamount);

				break;
				
			case 3:
				System.out.println("pin : ");

				int showpin = sc.nextInt();
				card.showBalance(showpin);
				

				break;
				
			case 6:
				System.out.println("thank you for using our app");

				System.exit(0);
			
				
				break;

			default:
				break;
			}
	
		}
	}
}
