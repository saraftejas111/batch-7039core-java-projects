package com.mapstudy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {

	
	public static void main(String[] args) {
		
		Map<String, Integer> players = new HashMap<>() ; 
		
		players.put("Virat", 10) ; 
		players.put("Dhoni", 7) ; 
		players.put("Rohit", 45) ; 
		players.put("Virat", 18) ; 
		players.put("Sehwag", null) ;  // 
		players.put(null, 111) ;
		players.put("Raina", 19) ; 
		players.put(null, 222) ;
		players.put("Hardik", null) ; 
		
		System.out.println("HashMap --> "+players);
		
		Map<String, Integer> playerss = new LinkedHashMap<>() ; 
		
		playerss.put("Virat", 10) ; 
		playerss.put("Dhoni", 7) ; 
		playerss.put("Rohit", 45) ; 
		playerss.put("Virat", 18) ; 
		playerss.put("Sehwag", null) ;  // 
		playerss.put(null, 111) ;
		playerss.put("Raina", 19) ; 
		playerss.put(null, 222) ;
		playerss.put("Hardik", null) ; 
		
		System.out.println("\nLinkedHashMap --> "+playerss);
		
		
		Map<String, Integer> playersss = new TreeMap<>() ; 
		
		playersss.put("Virat", 10) ; 
		playersss.put("Dhoni", 7) ; 
		playersss.put("Rohit", 45) ; 
		playersss.put("Virat", 18) ; 
		playersss.put("Sehwag", null) ;  // 
		//playersss.put(null, 111) ;
		playersss.put("Raina", 19) ; 
		//playersss.put(null, 222) ;
		playersss.put("Hardik", null) ; 
		
		System.out.println("\nTreeMap --> "+playersss);
	}
}

// map stores the data in key value pairs
// duplicate keys are not allowed

// HashMap : do not follows insertion order

// LinkedHashMap  : follows insertion order

// TreeMap : follows sorting order {do not pass null keys, as it sort the data on the basis of key}

