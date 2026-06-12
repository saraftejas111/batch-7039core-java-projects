package com.vehicle;

public class Vehical {

	private static int id;

	private String name;

	private int year;

	private double weight;

	public Vehical(String name, int year, double weight) {
		super();
		this.id++;
		this.name = name;
		this.year = year;
		this.weight = weight;
		
		if(year < 1886 || weight < 10) {
			System.out.println("Invalid year or weight provided.");
		}

		System.out.println("Car ID = " + id);
		System.out.println("Car Name = " + this.name);
		System.out.println("Car Year = " + this.year);
		System.out.println("Car Weight = " + this.weight+" kg");
	}

	public Vehical() {
	
		this.id++;
		this.name = "Default Car";
		this.year = 2000;
		this.weight = 1000;

		System.out.println("Car ID = " + id);
		System.out.println("Car Name = " + this.name);
		System.out.println("Car Year = " + this.year);
		System.out.println("Car Weight = " + this.weight+" kg");
	}
	
	

}
