package com.ahadhiya;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DriverUnitTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertTrue(true);
		
	}
	@Test
	// Home Page navigation test
	public void canGotoHomePage(){
		//Navigate to Homepage in Page object 
		System.out.println("Before going to assering isAt() ");
		Pages.homePage().goTo();
		
		Assert.assertTrue(Pages.homePage().isAt());
		
	}



}
