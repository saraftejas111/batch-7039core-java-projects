package com.rtexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TestProduct {

	public static void main(String[] args) {

		Product p1 = new Product(101, "milk", "dairy", 1500);
		Product p2 = new Product(104, "eraser", "st", 100);
		Product p3 = new Product(105, "pen", "st", 200);
		Product p4 = new Product(102, "laptop", "electronics", 50000);
		Product p5 = new Product(103, "mobile", "electronics", 20000);

		List<Product> allproducts = new ArrayList<>();

		allproducts.add(p1);
		allproducts.add(p2);
		allproducts.add(p3);
		allproducts.add(p4);
		allproducts.add(p1);
		allproducts.add(p5);
		allproducts.add(p1);

		System.out.println("---  iterating list by enhance for loop ----");

		for (Product pro : allproducts) {
			System.out.println(pro);
		}

		Set<Product> setproducts = new LinkedHashSet<>(allproducts);

		System.out.println("\n---  iterating set by enhance for loop ----");

		for (Product pro : setproducts) {
			System.out.println(pro);
		}

		System.out.println("\n--- fetch all products price > 10,000 ----");

		for (Product pro : setproducts) { // readonly

			if (pro.getPrice() > 10000) {
				System.out.println(pro.getPname() + "  --> " + pro.getPrice());
			}
		}

		System.out.println("\n---  remove milk name products by forLoop ----");

//		for (Product pro : allproducts) {
//
//			if (pro.getPname() == "milk") {
//
//				allproducts.remove(pro);
//
//			} else {
//				System.out.println(pro);
//			}
//		}

		Iterator<Product> itr = setproducts.iterator();

		// inbuilt : hasNext() , next() , remove();

		while (itr.hasNext()) {

			Product pro = itr.next();

			if (pro.getPname() == "milk") {
				itr.remove();
			} else {
				System.out.println(pro);
			}
		}

		System.out.println("\n---  after removing milk by iterator ----");

		for (Product product : setproducts) {
			System.out.println(product);
		}

	}
}


// ListIterator : 9 methods , works with only listimplemented classes
