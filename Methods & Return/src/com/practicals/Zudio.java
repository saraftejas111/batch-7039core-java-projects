package com.practicals;

public class Zudio {

	// separate method to calculate totalbill

	double calculatetotalBill(double d1, double d2, double d3) {
		return d1 + d2 + d3;

	}

	// separate method to calculate GST of TotalBill
	double calculateGST(double total) {
		return total * 0.18;
	}

	double calculatetotalWithGST(double totalBill, double gst) {
		return (totalBill + gst);
	}

	double calculateDiscout(double totalWithGST) {
		return totalWithGST * 0.33;
	}

	double calculatefinalBill(double totalWithGST, double discount) {
		return totalWithGST - discount;
	}

	void calculateBill(double d1, double d2, double d3) {

		double totalBill = calculatetotalBill(d1, d2, d3); // 3000

		double gst = calculateGST(totalBill); // 600 - 60 = 540

		System.out.println("Total Bill = " + totalBill);
		System.out.println("GST by 18% = " + gst);

		double totalWithGST = calculatetotalWithGST(totalBill, gst);

		System.out.println("Toatl Bill + GST = " + totalWithGST);

		double discount = calculateDiscout(totalWithGST);

		System.out.println("discount 33% i.e = " + discount);

		double finalBill = calculatefinalBill(totalWithGST, discount);

		System.out.println("Final Bill after disc = " + finalBill);
	}

}
