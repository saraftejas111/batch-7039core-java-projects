package com.demo;

// oop
public class Person {

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		if (age > 0 &&  age < 100 ) {
			this.age = age ; 
		} else {
			System.out.println("invalid age");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age = " + age + ", name = " + name + "]";
	} 
	
	

	
}

// Binding of data into single entity

// restrict the access of global fields

// access them via public methods like getter & setters