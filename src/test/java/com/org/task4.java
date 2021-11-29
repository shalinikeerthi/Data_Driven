package com.org;

import org.testng.annotations.Test;

public class task4 {
	@Test
	private void amzon_login() {
System.out.println("Amazon Homepage");
	}
@Test(timeOut = 3000)
private void facebook_login()throws Throwable {
	System.out.println("Facebook Homepage");

}
@Test
private void flipkart_login() {
System.out.println("Flipkart Homepage");

}


}
