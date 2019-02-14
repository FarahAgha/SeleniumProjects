package com.cuisinart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browser {

//	static WebDriver driver = new FirefoxDriver();
	static WebDriver driver = new ChromeDriver();
	

	
	

	public static void goTO(String url) {
		driver.manage().window().maximize();
		driver.get(url);

	}

	public static String title() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	public static void close() {
		driver.close();

	}
	

}
