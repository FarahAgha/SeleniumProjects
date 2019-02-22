package com.ahadhiya;

public class HomePage {
	static String url = "https://www.footlocker.com/";
	String title = "Approved | Sneakers, Apparel & More | Foot Locker";

	public void goTo() {
		// Navigate to the URL
		Browser.goTo(url);
		
	}

	public boolean isAt() {
		// return true if match the expected result
		System.out.println(title);
		return Browser.title().equals(title);
	}

}
