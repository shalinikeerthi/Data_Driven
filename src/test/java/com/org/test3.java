package com.org;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class test3 {
	WebDriver driver;
	
	@BeforeSuite
       public void set_Up()
       {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHALINI\\eclipse-workspace\\Data_Driven\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
       }
	@Test(groups = "shopping")

	public void amazon_launch() {
		driver.get("https://www.amazon.in/");
	}
	@Test(groups = "shopping")
	
	public void myntra_launch() {
		driver.get("http://www.myntra.com/");

	}
	@Test
	
public void facebook_launch() {
		driver.get("http://www.facebook.com/");
	}
	public void twitter_launch() {
		driver.get("https://twitter.com/i/flow/login");
	}
	@BeforeSuite
	public void close_Browser() {
		driver.close();

	}
}





