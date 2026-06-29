package com.filestudy;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class UpdateFile {

	public static void main(String[] args) throws Exception {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("tejas.txt", true))) {

			bw.write("\n6.update from bufferedwriter...");

			System.out.println("text inserted in file... ");

		}
	}
}
