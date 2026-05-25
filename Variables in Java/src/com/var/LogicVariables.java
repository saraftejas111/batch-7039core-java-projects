package com.var;

public class LogicVariables {

	static int id; // global variable

	void m1() {
		String name = "Tejas"; // Local variable

		int b = 12;

		System.out.println(id);
		System.out.println(name);
		System.out.println(b);
	}

	void m2() {

		int b = 15;
		System.out.println(id);
		// System.out.println(name); // no , because name is local var of m1()
		System.out.println(b);
	}

}

// Global variable stores in Heap Memory
// Global variable cannot have exact same name 

// Local variable stores in Stack Memory
// Local also  cannot be created as same name in same class
// but can be created in diff class