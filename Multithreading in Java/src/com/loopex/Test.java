package com.loopex;

public class Test {

	public static void main(String[] args) throws InterruptedException {

//		Task1 t1 = new Task1() ; 
//		Task2 t2 = new Task2();
//		
//		t1.start();
//		t2.start();

		Account ac = new Account(); // bal = 1000

		System.out.println("initial balance = " + ac.balance);

		Deposit d = new Deposit(ac); // 1500

		Withdraw w = new Withdraw(ac); // 1300

		d.start();    // 1,2,3....... 4,5
		w.start();    // 1,2,3,4,5

	
		d.join();
		w.join();

		System.out.println("after tran, balance = " + ac.balance);
	}
}
