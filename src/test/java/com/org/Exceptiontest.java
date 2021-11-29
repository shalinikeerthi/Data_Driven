package com.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exceptiontest {
	WebDriver driver;
	@Test(expectedExceptions = WebDriverException.class )
	private void insta() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\SHALINI\\eclipse-workspace\\Data_Driven\\Driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
	}
}
