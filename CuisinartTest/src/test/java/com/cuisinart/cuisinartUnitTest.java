
package com.cuisinart;

import static org.junit.Assert.*;

import org.junit.After;
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
		Pages.CookwarePage().goTo();
		Pages.CookwarePage().goToSaucepans();
//		Assert.assertTrue(Pages.CookwarePage().isAt());
	}
	
	@After
	public void cleanup(){
		Browser.close();
	}
}
