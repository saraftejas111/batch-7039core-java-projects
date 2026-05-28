package com.looping;

public class ForLoop {

	public static void main(String[] args) {
		
		int i ;
		
		for ( i = 1 ; i <= 5 ; i++) {
			System.out.println(i+" Hello World");
		}
		
		System.out.println("loop terminated at i = "+i);
		
		
		 //   init       end       update
		for(int e = 1 ; e <=100 ; e++) {
			
			if(e % 2 == 0 ) {
				System.out.println(e+" is even");
			}else {
				System.out.println(e+" is odd");

			}
		}
		
		System.out.println("\n*** Reverse Loop ***");
		
		// reverse
		for (int z = 10 ; z >= 1 ; z--) {
			System.out.println(z);
		}
	}
}
