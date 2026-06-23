package com.overload;

public class Instagram {

	void login(int mobile, String password) {

		System.out.println("login success by mob-pass");
	}

	void login(String user, String pass) {

		String u = user.toLowerCase().trim();

		if (u.contains("@")) {
			System.out.println("login success by email : " + u + " - pass ");

		} else {
			System.out.println("login success by userID : " + u + " - pass ");

		}

	}

}
