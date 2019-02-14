package com.cuisinart;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class cuisinartUnitTest {

	 @Test
	 public void canGotoHomePage() {
	 Pages.homePage().goTo();
	 Assert.assertTrue(Pages.homePage().isAt());
	 }
	

	@Test
	public void canGotoCookwarePage() {
		passCategory("COOKWARE");
	}
	
	@Test
	public void canGotoOutdoorGrillingPage() {
		passCategory("OUTDOOR GRILLING");
		
	}
	
	@Test
	public void canGotoAppliancesPage() {
		passCategory("APPLIANCES");
	}


	private void passCategory(String category) {
		Pages.outdoorGrilling().goTo();
		CategoryPage categorypage = Pages.outdoorGrilling().getCategoryPage(category);
		categorypage.goTo();
		Assert.assertTrue(categorypage.isAtCategory(category));
	}

	@AfterClass
	public static void cleanup() {
		Browser.close();
	}
}
