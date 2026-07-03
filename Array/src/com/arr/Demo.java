package com.arr;

public class Demo {

	public static void main(String[] args) {

		// using new keyword : 
		
		int[] arr1 = new int[500] ;  
		
		arr1[0] = 3 ; 
		arr1[1] = 9 ; 
		arr1[2] = 5 ; 
		arr1[3] = 1 ;
//		
//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);
//		System.out.println(arr1[4]);
//		System.out.println(arr1[5]);
//		System.out.println(arr1[6]);	
//		System.out.println(arr1[7]);
//		
//		System.out.println("\n");
		
//		System.out.println("iterating using for loop");
//
//		for(int i = 0 ; i <= arr1.length - 1 ; i++) {		
//			System.out.println(arr1[i]);
//		}
//
//		System.out.println("\niterating using for-each loop");
//		
//		for (int v : arr1) {
//			System.out.println(v);
//			// directly deals with values , do not follows index
//		}
			
		int [] arr2 = {4,1,5,3,2} ;  // directly assigned, without new keyword 
		
//		System.out.println("\narr2 data");
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		
		for (int i : arr2) {
			System.out.println(i);
		}
		
	}
}
