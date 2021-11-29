package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider  = "login_Credentials")
	private void facebook_Login(String username ,String password) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHALINI\\eclipse-workspace\\Data_Driven\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(username);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
	}
	
	@DataProvider
	private Object[][] login_Credentials() {
	return new Object[][]
			{
		{"AAA","111"},{"BBB","222"},{"CCC","333"}
			};

	}
	
	@Test
	private void kkk() {
		

	}
	}