package com.practicals;

public class ZudioTest {

	public static void main(String[] args) {
		
		Zudio z = new Zudio();
	
		double shirt = 1000 ; 
				
		double jeans = 1000 ; 
		
		double jacket = 1000 ; 
		
		z.calculateBill(shirt , jeans , jacket);
	}
}


// Total Bill             = ......
// GST 18%                = ......
// Toatl Bill + GST       = ......
// discount 33% i.e       = ......
// Final Bill after disc  = ......