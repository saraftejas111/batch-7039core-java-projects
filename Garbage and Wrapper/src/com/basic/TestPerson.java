package com.basic;

public class TestPerson {

	/*
	 * it is a process in java where java removes or delete the unused objects..
	  
	  3 gb
	 
	  p3 new -- 1gb
	  p4 new -- 1gb 
	  p2 new -- 1gb
	  
	  finalize() ; 
	  
	  final keyword use to achieve immtability , var,method,class
	   
	  finally block : use in exception handling with try block  
	  it will always get execute weather the exeception occurs or not 
	  
	  & finalize 
	  is a method of object class, runs before the gc()
	  performs the clean up process , or delocated the object from memory to get gc()
	  
	 */

	public static void main(String[] args) {

		Person p1 = new Person(1, "raj", 123456);

		Person p2 = new Person(11, "tina", 1234); // old object garbage collected

		Person p3 = new Person(12, "jay", 12345);

		Person p4 = new Person(13, "neha", 12345);

		p1 = null; // assigning null, eligible for GC

		p2 = new Person(111, "lokesh", 12345); // new refference eligible for GC

		new Person(222,"karan" ,12345); // anonymous object ,  eligible for GC

	}
}
