package com.org;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreConcept {

	private static void amazon_page() {
		// TODO Auto-generated method stub
		System.out.println("Amazon login")
		;

	}
	@Test(priority=0)
	private void flipkart_Page() {
		System.out.println("Flipkart login");
	}
	
	@Test(priority=-1)

	private void myntra_page() {
		System.out.println("Myntra login");
	}
	@Test(priority=1)

	private void facebook_page() {
		System.out.println("facebook login");

	}

}