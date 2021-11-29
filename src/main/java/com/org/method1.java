package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class method1 {

	@Test(dependsOnMethods = "set_Up1")
	public void set_Up() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
        
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		login.sendKeys("shalu123@gmail.com");
	}

	@Test
	public void set_Up1() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

	}

}
