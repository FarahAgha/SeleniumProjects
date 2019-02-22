package com.ahadhiya;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	static WebDriver driver= new FirefoxDriver();
	
	public static void goTo(String url) {
		// Navigating to URL
		driver.get(url);
		
	}
	public static String title() {
		// return title of the current page
		return driver.getTitle();
	}
	
	

}
