package com.demo;



public class Test {

	public static void main(String[] args) {
		
	Person p1 = new Person();
	
       p1.setAge(21);
       p1.setName("Raj");
       
      // System.out.println("age = "+p1.getAge());
      //System.out.println("name = "+p1.getName());
       
       Account a1= new Account(123456, "Tejas", 2000) ; 
       
       a1.pinChange(1234, 1212);
       
      System.out.println("My Balance = "+a1.getBalance(1212));
	}
}
