package com.practicals;

public class Shopping {

	double electricalGST(double e1, double e2) {

		double eletotal = e1 + e2 ; 
		double gst15 = eletotal * 0.15 ; 
		double eleGST = eletotal+gst15 ;   // 230 
		
		return eleGST ; 
			
	}

	double foodGST(double f1 , double f2) {

		double foodtotal = f1 + f2 ; 
		double gst08 = foodtotal * 0.08 ; 		
		double foodGST = foodtotal  + gst08 ; 
		
		return foodGST ; 
	}

	double clothGST(double c1) {

		double clothGST = c1 + (c1*0.18) ; 
		
		return clothGST ; 
	}
	
	double totalWithGST (double eGST ,double fGST ,double cGST) {
		
		return eGST + fGST + cGST ; 
	}

	void discountedBill(double e1 , double e2 , double f1 , double f2 , double c1) {
		
		double eleGST = electricalGST(e1,e2) ; 
		
		double fGST = foodGST(f1, f2);
		
		double cGST = clothGST(c1) ; 
		
		double totalWithGSTPrice = totalWithGST(eleGST, fGST, cGST);
		
		double discount = totalWithGSTPrice * 0.2 ; 
		
		System.out.println("Total Bill with GST = "+totalWithGSTPrice);
		
		System.out.println("Discount of 20% applied = "+ (float) discount);
		
		double finalBill = totalWithGSTPrice - discount ; 
		
		System.out.println("Final Bill = "+finalBill);
		
		
	}
	
}
