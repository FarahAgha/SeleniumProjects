package com.cuisinart;

import org.openqa.selenium.support.PageFactory;

public class Pages {

	public static HomePage homePage() {
		// TODO Auto-generated method stub
		return new HomePage();
	}

	public static ShopByCategorypage cookwarePage() {
		ShopByCategorypage cookwarepage = new ShopByCategorypage();
		return cookwarepage;
	}

	public static CategoryPage CookwarePage() {
		CategoryPage cookwarePage = new CookwarePage();
		PageFactory.initElements(Browser.driver, cookwarePage);
		return cookwarePage;
	}
	
	public static ShopByCategorypage outdoorGrilling() {
		ShopByCategorypage outdoorGrilling = new ShopByCategorypage();
		return outdoorGrilling;
	}

	public static CategoryPage OutdoorGrilling() {
		CategoryPage outdoorGrilling = new OutdoorGrilling();
		PageFactory.initElements(Browser.driver, outdoorGrilling);
		return outdoorGrilling;
	}
	
	public static ShopByCategorypage appliances() {
		ShopByCategorypage appliances = new ShopByCategorypage();
		return appliances;
	}
	public static CategoryPage Appliances() {
		CategoryPage appliances = new Appliances();
		PageFactory.initElements(Browser.driver, appliances);
		return appliances;
	}

}
