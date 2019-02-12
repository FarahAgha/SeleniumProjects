package com.cuisinart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	//System.setProperty("webriver.gecko.driver", "C:\\Users\\deltaman\\Documents\\Automation\\DriverLocation\\geckodriver.exe");
    static WebDriver driver = new FirefoxDriver();
    

	public static void goTO(String url) {
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
