package com.liststudy;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();

		nums.add(1);
		nums.add(5);
		nums.add(3);
		nums.add(4);
		nums.add(2);

	// 	System.out.println(nums.get(1));

		for (int i = 0; i < nums.size(); i++) {

			System.out.println(nums.get(i));
		}

	}

}
// why companies do not prefer vector ? 
// --> it is thread safe and collection deals with multiple object & operation on data so fast execution
// of thread isneeded where thread safe means slow execution 