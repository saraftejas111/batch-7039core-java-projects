package com.test.all; // address

import com.pack.one.Demo1;
import com.pack.one.Demo2;
import com.pack.one.Demo3;
//import com.pack.two.Demo1; 

// import com.pack.one.*;   // 100 gb 

public class TestPack {

	public static void main(String[] args) {

		Demo1 d1 = new Demo1(); // 1kb
		Demo2 d2 = new Demo2(); // 1kb
		Demo3 d3 = new Demo3(); // 1kb
		
		d1.m1();
		
		com.pack.two.Demo1 dd2 = new com.pack.two.Demo1();
		
		dd2.m1();
		

		// ctrl + shift + o --> imports/remove packages

		// 100 classess -

		// we want 99 classes..

		// write import 99 times or use * ?

		// dev - always prefers 99 times import

	}

}
