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
		openCategory("COOKWARE");
	}

	@Test
	public void canGotoOutdoorGrillingPage() {
		openCategory("OUTDOOR GRILLING");

	}

	@Test
	public void canGotoAppliancesPage() {
		openCategory("APPLIANCES");
	}

	private void openCategory(String category) {
		Pages.outdoorGrilling().goTo();
		CategoryPage categorypage = Pages.outdoorGrilling().getCategoryPage(
				category);
		// System.out.println(category);
		categorypage.goTo();
		Assert.assertTrue(categorypage.isAtCategory(category));
	}

	@AfterClass
	public static void cleanup() {
		Browser.close();
	}
}
