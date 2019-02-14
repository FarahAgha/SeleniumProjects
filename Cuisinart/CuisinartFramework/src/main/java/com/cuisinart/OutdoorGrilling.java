package com.cuisinart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OutdoorGrilling extends CategoryPage{
	//Outdoor Grilling
	///html/body/div[1]/div[2]/div/header/div/div/h1
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/header/div/div/h1")
	WebElement pageElement;

	@Override
	public void goTo() {
		String xp = "//h3[contains(.,'Outdoor Grilling')]";
		//"//div[2]/div[3]/div/a/div[2]/h3"
		Browser.driver.findElement(By.xpath(xp))
		.click();
		
	}

	@Override
	public String categoryName() {
		return pageElement.getText();
	}

}
