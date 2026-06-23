package com.overrides;

public class TestCars {
	public static void main(String[] args) {

		Car cc = new Car();
		cc.speed();
		
		Nexon nc = new Nexon() ;		
		nc.speed();
		
		BMW bmw = new BMW() ; 
		bmw.speed();
	}
}
