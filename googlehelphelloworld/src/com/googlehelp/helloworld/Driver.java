package com.googlehelp.helloworld;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class  Driver {
	public static WebDriver driver;
//InterruptedException
	public  static WebDriver Chrome() {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\deltaman\\Documents\\Automation\\DriverLocation\\chromedriver.exe");
			
			   driver = new ChromeDriver();
			   driver.manage().window().setSize(new Dimension(1024,2024));
			return driver;
			   
		}
	public static WebDriver Firefox(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\deltaman\\Documents\\Automation\\DriverLocation\\geckodriver.exe");
       driver = new FirefoxDriver();
        
       return driver;
		
	}
}
