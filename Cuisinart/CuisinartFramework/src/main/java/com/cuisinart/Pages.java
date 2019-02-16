package com.cuisinart;

import org.openqa.selenium.support.PageFactory;

public class Pages {

	public static HomePage homePage() {
		// TODO Auto-generated method stub
		return new HomePage();
	}

	public static ShopByCategoryPage cookwarePage() {
		ShopByCategoryPage cookwarepage = new ShopByCategoryPage();
		return cookwarepage;
	}

	public static ShopByCategoryPage outdoorGrilling() {
		ShopByCategoryPage outdoorGrilling = new ShopByCategoryPage();
		return outdoorGrilling;
	}

	public static ShopByCategoryPage appliances() {
		ShopByCategoryPage appliances = new ShopByCategoryPage();
		return appliances;
	}

	public static CategoryPage OutdoorGrilling() {
		CategoryPage outdoorGrilling = new OutdoorGrilling();
		PageFactory.initElements(Browser.driver, outdoorGrilling);
		return outdoorGrilling;
	}

	public static CategoryPage CookwarePage() {
		CategoryPage cookwarePage = new CookwarePage();
		PageFactory.initElements(Browser.driver, cookwarePage);
		return cookwarePage;
	}

	public static CategoryPage Appliances() {
		CategoryPage appliances = new Appliances();
		PageFactory.initElements(Browser.driver, appliances);
		return appliances;
	}

}
