package com.filestudy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {

//	     String fileName = "tejas.txt" ; 
//	     
//	     FileWriter  fw = new FileWriter(fileName);
//	     
//	     fw.write("Hello from Java...");
//	     fw.write("this is my next words..");
//	     fw.write("\nThis will show on next line...");
//	     fw.close();
//   
//	     System.out.println("text inserted in file... " + fileName);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("tejas.txt"))) {

			bw.write("1.hello from bufferedwriter...");
			bw.write("\n2.How are you doing?..");
			bw.write("\n3.What are you doing?..");
			bw.write("\n4.Why are you doing?..");
			bw.write("\n5.Where are you?..");


			System.out.println("text inserted in file... ");

		}
	}
}

// try with resource
