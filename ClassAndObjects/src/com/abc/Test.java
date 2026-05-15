package com.abc;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "Raj Patil";
		e1.salary = 123456.7;

		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		
		System.out.println("\n----\n");
		
		Employee e2 = new Employee();
		e2.id = 102;
		e2.name = "Neha Sharma";
		e2.salary = 123556.23;

		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.salary);

	}
}
