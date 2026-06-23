package com.overrides;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println("-- SavingsAccount --");
		
		SavingsAccount sa = new SavingsAccount() ; 
		sa.withdraw();
		
		System.out.println("\n-- CurrentAccount --");

		
		CurrentAccount ca = new CurrentAccount() ; 
		ca.withdraw();
	}
}
