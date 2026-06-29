package com.filestudy;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {

		File file = new File("kiran.txt");

		boolean result = file.delete();

		if (result) {
			System.out.println("File Deleted Successfully...");
		} else {
			System.out.println("File Not Deleted");

		}
	}
}
