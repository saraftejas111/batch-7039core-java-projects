package com.objectstudy;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectRecieve {  // De-Serialization

	public static void main(String[] args) {

		File file = new File("kiran.dat");

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

			Employee emp;

			while ((emp = (Employee) ois.readObject()) != null) {

				System.out.println(emp);
				
			}
		} catch (EOFException e) {
			System.out.println("\nData ended...");
		} catch (Exception e) {
			System.out.println("something went wrong...");
		}

	}
}



