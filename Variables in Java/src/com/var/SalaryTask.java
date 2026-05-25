package com.var;

public class SalaryTask {

	int salary = 50000;

	double bonus() {

		double bonusOnSalary = salary * 0.45;

		return bonusOnSalary;
	}

	double tax() {

		double taxOnSalary = salary * 0.35;

		return taxOnSalary;
	}

	void finalSalary() {

		System.out.println("Base Salary = " + salary);
		System.out.println("Bonus = " + bonus());
		System.out.println("Tax = " + tax());
		double finalSalary = (salary + bonus()) - tax();
		System.out.println("Final Salary = " + finalSalary);
	}
}
