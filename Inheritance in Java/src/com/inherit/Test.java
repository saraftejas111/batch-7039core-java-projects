package com.inherit;

public class Test {

	public static void main(String[] args) {

		System.out.println("---- Car c = new Car();  ----");
		Car c = new Car();
		System.out.println(c.speed);
		c.m1();

		System.out.println("\n---- Honda h = new Honda(); ----");

		Honda h = new Honda();
		System.out.println(h.speed);
		h.m1();

		System.out.println("\n--- HondaCivic hc = new HondaCivic(); ----");

		HondaCivic hc = new HondaCivic();
		System.out.println(hc.speed);
		hc.m1();
		System.out.println("\n---- Tata tc = new Tata(); ----");

		Tata tc = new Tata();
		System.out.println(tc.speed);
		tc.m1();
		System.out.println("\n---- TataNexon tn = new TataNexon(); ----");

		TataNexon tn = new TataNexon();
		System.out.println(tn.speed);
		tn.m1();
		System.out.println("\n---- TataPunch tp = new TataPunch(); ----");

		TataPunch tp = new TataPunch();
		System.out.println(tp.speed);
		tp.m1();

		System.out.println("\n---- Toyota tyc = new Toyota(); ----");

		Toyota tyc = new Toyota();
		System.out.println(tyc.speed);
		tyc.m1();

		System.out.println("\n---- ToyotaFortuner tfc = new ToyotaFortuner(); ----");

		ToyotaFortuner tfc = new ToyotaFortuner();
		System.out.println(tfc.speed);
		tfc.m1();

	}
}
