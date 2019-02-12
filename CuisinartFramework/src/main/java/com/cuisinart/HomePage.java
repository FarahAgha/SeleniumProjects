package com.cuisinart;

public class HomePage {
	static String url = "https://www.cuisinart.com";
	static String title = "Cuisinart's Kitchen Appliances for Professional and Home Chefs - Cuisinart.com";

	public void goTo() {
		Browser.goTO(url);
		
	}

	public boolean isAt() {
		
		return Browser.title().equals(title);
	}
	

	
}
