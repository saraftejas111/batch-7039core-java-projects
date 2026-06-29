package com.filestudy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (BufferedReader br = new BufferedReader(new FileReader("tejas.txt"))) {

			String fileMsg;

			while ((fileMsg = br.readLine()) != null) {

				System.out.println(fileMsg);
			}
		}
	}
}
