package com.inbuiltmethods;

public class Account extends Thread {

	@Override
	public void run() {
		work();
	}
	private void work() {
		System.out.println("working....");
	}

	public static void main(String[] args) throws InterruptedException {

		// main thread ... 
		Account ac = new Account();

		System.out.println("start..");

	    ac.start();   // another thread..
	    
	    ac.join();
	    
		System.out.println("end..");

	}

}

// sleep -- //		Thread.sleep(2000);
// join()   -- joins the thread