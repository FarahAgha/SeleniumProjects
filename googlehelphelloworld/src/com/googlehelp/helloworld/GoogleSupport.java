package com.googlehelp.helloworld;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class GoogleSupport {
	
	WebDriver driver = Driver.Chrome();
	
//	WebDriver driver = Driver.Firefox();
	
	//TODO: get dimensions from config
	
	
	

//	@Test
//	public void launchURL(){
//		driver.get("https://support.google.com/");
//		WebElement targetPageCheck 
//					= driver.findElement(By.xpath(".//div[normalize-space() = 'How can we help you?']"));
//		
//		String expectedResult = "How can we help you?";
//		String actualResult = targetPageCheck.getText();
//		boolean istextAvailable =(expectedResult.equals(actualResult));
//		assertTrue(istextAvailable, "\n(Expected result: "+expectedResult+") on the target page ");	
//	}
	
	@Test
	public void SupportSearch(){	
		driver.get("https://support.google.com/");
		WebElement DescribeYourIssue = driver.findElement(By.name("q"));
		//"Get a refund on Google Play"
		ConfigFileReader reader = new ConfigFileReader();
		System.out.println(System.getProperty(".", "dir"));
		String strSearch = reader.getSearchText().replace("\"", "");
		System.out.println(strSearch);
		
		DescribeYourIssue.sendKeys(strSearch);

		WebElement searchButtonClick = driver.findElement(By.xpath("//form[@id='search-form']/button"));
		searchButtonClick.click();

		WebElement targetPageCheck = driver.findElement(By.xpath("//div[@class = 'heading']"));

		String expectedResult = "Search results for Get a refund on Google Play";
		String actualResult = targetPageCheck.getText().replace("\"", "");
		System.out.println(actualResult);
		
		boolean istextAvailable =(expectedResult.equals(actualResult));
		assertTrue(istextAvailable, "\n(Expected result: "+expectedResult+") on the target page ");	
	}

	@AfterClass
	public void driverQuit(){
//		driver.quit();
	}
	
	 
}
