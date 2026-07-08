package com.ipl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IplMap {

	public static void main(String[] args) {

		// team --> players
		// 1 --> multiple

		List<String> miplayers = new ArrayList<>();

		miplayers.add("rohit");
		miplayers.add("hardik");
		miplayers.add("bumrah");

		List<String> rcbplayers = new ArrayList<>();

		rcbplayers.add("virat");
		rcbplayers.add("rajat");
		rcbplayers.add("abd");

		List<String> cskplayers = new ArrayList<>();

		cskplayers.add("dhoni");
		cskplayers.add("ruturaj");
		cskplayers.add("jadeja");
		
		// team --> players		
		// key --> value
		
		Map<String , List<String>> teams = new HashMap<>();
		
		teams.put("MI" , miplayers); 
		teams.put("RCB" , rcbplayers); 
		teams.put("CSK" , cskplayers); 
	
		// System.out.println(teams);		
		//	System.out.println(teams.get("RCB"));   // get(key)  --> returns values
		
	   teams.forEach((k,v) -> System.out.println(k+" : "+v));
		
	   System.out.println("\n");	   
	   
		for(String key : teams.keySet()) {	
			System.out.println(key+" : "+teams.get(key));
		}
		
		System.out.println("\n");
		
		for(Map.Entry<String, List<String>> kv : teams.entrySet()) {		
			System.out.println(kv.getKey()+" : "+kv.getValue());
		}
	}
}

// go tochat GPT and askforfor task
