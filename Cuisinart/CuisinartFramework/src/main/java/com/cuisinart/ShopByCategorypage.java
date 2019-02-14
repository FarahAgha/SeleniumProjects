package com.cuisinart;



public class ShopByCategorypage {

	static String url = "https://www.cuisinart.com/"; //"https://www.cuisinart.com";
	static String title = "Cookware - Cuisinart.com";

	public void goTo() {
		Browser.goTO(url);

	}

	public CategoryPage getCategoryPage (String page){
		switch (page){
		case "COOKWARE":
			return Pages.CookwarePage();
		
		case "OUTDOOR GRILLING":
			return Pages.OutdoorGrilling();
			
		case "APPLIANCES":
			return Pages.Appliances();
			
		}
		return null;
	}

	

}
