package com.rev;

public class Test {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.roll = 1;
		s1.name = "raj";
		s1.marks = 78;

		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.marks);

		System.out.println("\n"); // for gap

		Student s2 = new Student();
		s2.roll = 2;
		s2.name = "tina";
		s2.marks = 92;

		System.out.println(s2.roll);
		System.out.println(s2.name);
		System.out.println(s2.marks);

		System.out.println("\n"); // for gap

		SeniorStudent ss1 = new SeniorStudent();

		ss1.s.roll = 101;
		ss1.s.name = "Jay Sharma";
		ss1.s.marks = 84;
		ss1.activity = "football";

		System.out.println(ss1.s.roll);
		System.out.println(ss1.s.name);
		System.out.println(ss1.s.marks);
		System.out.println(ss1.activity);
	}
}
