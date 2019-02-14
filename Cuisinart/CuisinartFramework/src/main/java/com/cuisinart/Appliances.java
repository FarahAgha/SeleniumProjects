package com.cuisinart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Appliances extends CategoryPage{

	@FindBy(how = How.CSS, using = "h1.text-uppercase")
	WebElement pageElement;
	
	@Override
	public void goTo() {
		String xp = "//h3[contains(.,'Appliances')]";
		//"//div[1]/div/a/div[2]/h3"
		Browser.driver.findElement(By.xpath(xp))
		.click();
		
	}

	@Override
	public String categoryName() {
		return pageElement.getText();
	}

}
