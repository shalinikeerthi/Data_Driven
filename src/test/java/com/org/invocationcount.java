package com.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class invocationcount {
WebDriver driver;
@BeforeSuite
public void set_Up() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\SHALINI\\eclipse-workspace\\Data_Driven\\Driver\\chromedriver.exe");
driver = new ChromeDriver();
}
@Test(invocationCount = 10)
public void amazon_launch() {
driver.get("http://www.amazon.in/");
}
@Test(invocationCount = 5)
public void myntra_launc() {
driver.get("http://www.myntra.in/");
}
@Test(invocationCount = 5)
public void facebook_launch() {
driver.get("http://www.facebook.com/");
}
@Test(invocationCount = 8)
public void instagram_lauch() {
driver.get("http://www.instagra.com/");
}
}
