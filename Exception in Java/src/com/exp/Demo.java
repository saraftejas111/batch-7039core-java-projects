package com.exp;

public class Demo {

	public static void main(String[] args) {

		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);// exp : goes to catch
			System.out.println(5);

			int[] arr = { 1, 2, 3 }; // index : 0,1,2

			// System.out.println(arr[4]);

			System.out.println(6);

			String str = "java";
			// System.out.println(str.charAt(5));

			System.out.println(7);

			Class.forName("com.exp.Demo");

			System.out.println(8);

		} catch (ArithmeticException e) {
			System.out.println("code me Arithmetic Exception aya");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("code me Array Index Out Of Bounds Exception aya");

		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
		}
	}
}
