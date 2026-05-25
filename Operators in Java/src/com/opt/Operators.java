package com.opt;

public class Operators {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;

		// 1. Arithmetic Operators
		System.out.println("*** 1. Arithmetic Operators ***");

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); //
		System.out.println(a % b); // modulus : remainder

		// 2. Relational (Comparison) Operators

		System.out.println("\n*** 2. Relational (Comparison) Operators ***");
		int x = 5;
		int y = 5;

		System.out.println(x == y); // true
		System.out.println(x != y); // false
		System.out.println(x > y); // false
		System.out.println(x < y); // false
		System.out.println(x >= y); // true
		System.out.println(x <= y); // true

		System.out.println("\n*** 3. Logical Operators ***");

		int p = 12;
		int q = 15;
		int r = 20;

		System.out.println((r > p) && (r < q));

		// AND opt return false if any of the statement is false

		System.out.println((r > p) || (r < q));

		// OR opt return true if any of the statement is true

		System.out.println(!(r < q));

		System.out.println("\n*** 4. Assignment Operators ***");

		int m = 40;
		int n = m;

		System.out.println(n);

		n += 5;

		System.out.println(n);

		n -= 3;

		System.out.println(n);

		// 5. Unary Operators

		System.out.println("\n*** 5. Unary Operators ***");

		int age = -19;

		System.out.println(-(age));

		int z = 5;

		System.out.println(++z); // pre - increament
		System.out.println(--z); // pre - decreament

		int c = 10;

		System.out.println(c++); // post - increament
		System.out.println(c--); // post - decreament

		System.out.println(c); // actual value

		boolean flag = false;

		System.out.println(!flag);

		System.out.println("\n*** 6. Ternary Operator ***");

		int marks = 42;

		String result = (marks > 90) ? "GRADE A" :

				        (marks > 80) ? "GRADE B" :

						(marks > 70) ? "GRADE C" :

					    (marks > 60) ? "GRADE D" :

					    (marks > 50) ? "GRADE E" : "FAIL";

		System.out.println(result);

	}

}
