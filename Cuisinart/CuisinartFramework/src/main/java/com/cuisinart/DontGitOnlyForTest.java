package com.cuisinart;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DontGitOnlyForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C://Users//deltaman//Documents//Automation//DriverLocation//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(0, 0));
		driver.manage().window().setSize(new Dimension(1229, 1002));
		driver.get("https://www.cuisinart.com/");

	}

}
