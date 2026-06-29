package com.filestudy;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("kiran.txt") ;
		
		boolean result = file.createNewFile();
		
		if (result) {
			System.out.println("File Created Success");
		} else {
			System.out.println("File Not Created");

		}
	}
}
