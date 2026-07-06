package com.setstudy;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("apple");
		set.add(null);
		set.add("kiwi");
		set.add("orange");
		set.add("apple");
		set.add(null);
		set.add("grapes");

		System.out.println("HashSet --> " + set);
		
		

		Set<String> sett = new LinkedHashSet<>();

		sett.add("apple");
		sett.add(null);
		sett.add("kiwi");
		sett.add("orange");
		sett.add("apple");
		sett.add(null);
		sett.add("grapes");

		System.out.println("\nLinkedHashSet --> " + sett);


		Set<String> settt = new TreeSet<>();

		settt.add("apple");
		// settt.add(null); // null values cannot be sort
		settt.add("kiwi");
		settt.add("orange");
		settt.add("apple");
		settt.add("grapes");

		System.out.println("\nTreeSet --> " + settt);
	}
}

//SET : Do not allows the duplicate objects

// Hashset :not follow insertion order
// LinkedHashSet: follow insertion order
// TreeSet : follows sorting order 