package com.dt;

public class DataTypes {
	
	byte b ; 
	short s ; 
	int i ; 
	long l ; 
	float f ; 
	double d ; 
	char c ; 
	boolean bl ;
	String str ; 
	int [] arr ; 
	Object obj ;    // parent of all data type
	
	// non-primitives default value is null
	
	void display() {
		System.out.println("byte --> "+b);
		System.out.println("short --> "+s);
		System.out.println("int --> "+i);
		System.out.println("long --> "+l);
		System.out.println("float --> "+f);
		System.out.println("double --> "+d);
		System.out.println("char --> "+c);
		System.out.println("boolean --> "+bl);
		System.out.println("String --> "+str);
		System.out.println("int [] arr --> "+arr);
		System.out.println("Object --> "+obj);

	}

	public static void main(String[] args) {
		DataTypes dt = new DataTypes();
	//	dt.display();
		
		int i = 987654321 ; 
		
		long mobile = 9876543210L ; 
		
		System.out.println("i --> "+i);
		System.out.println("long --> "+mobile);
		
		  float y = 12.56f ; 
		  
		System.out.println("float --> "+y);  
		
		  double dd = 1234.5678 ;
		  
		  System.out.println("double --> "+dd);
		  
		  
		  
	}
}
