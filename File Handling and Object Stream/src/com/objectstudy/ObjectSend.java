package com.objectstudy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectSend {  // Serialization

	public static void main(String[] args) throws Exception {
		
		File file = new File("kiran.dat") ; 
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
			
			Employee emp1 = new Employee(101 , "Raj" , 123456)  ; 
			Employee emp2 = new Employee(102 , "Tina" , 123456)  ; 
			Employee emp3 = new Employee(103 , "Jay" , 123456)  ; 
			Employee emp4 = new Employee(104 , "Neha" , 123456)  ; 

			oos.writeObject(emp1);
			oos.writeObject(emp2);
			oos.writeObject(emp3);
			oos.writeObject(emp4);
			
			System.out.println("object inserted to file : "+file.getName());
		}
	}
}
