package com.cuisinart;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	// static WebDriver driver = new FirefoxDriver();
	static WebDriver driver = new ChromeDriver();

	public static void goTO(String url) {
		driver.manage().window().setSize(new Dimension(1600,900));
		//webDriver.manage().window().setSize(new Dimension(1600,900));
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
