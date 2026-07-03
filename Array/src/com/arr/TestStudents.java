package com.arr;

public class TestStudents {

	public static void main(String[] args) {

		int[] gt = { 2, 4, 9, 1, 5, 6, 3, 8, 7 };

		// print only the num > 3
		System.out.println("print the num greater than 3");

		for (int i = 0; i < gt.length; i++) {

			if (gt[i] > 3) {

				System.out.println(gt[i]);
			}
		}

		System.out.println("\nprint the num lowest than 5");

		for (int i = 0; i < gt.length; i++) {

			if (gt[i] < 5) {

				System.out.println(gt[i]);
			}
		}

		System.out.println("\nprint the even nums only");

		for (int i = 0; i < gt.length; i++) {

			if (gt[i] % 2 == 0) {

				System.out.println(gt[i]);
			}
		}

		Students s1 = new Students(1, "Raj", 8);

		Students s2 = new Students(2, "Tina", 7);

		Students s3 = new Students(3, "Jay", 3);

		Students s4 = new Students(4, "Neha", 2);

		Students s5 = new Students(5, "Vivek", 5);

		// 500..

		Students[] allstudents = { s1, s2, s3, s4, s5 };

		System.out.println("\ncheck fail or pass status : \n");

		for (Students std : allstudents) {

			if (std.getMarks() >= 4) {
				System.out.println(std.getName() + " is Passed");
			} else {
				System.err.println(std.getName() + " is Fail");

			}
		}

	}

}
