package com.org;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task8 {
	@Test(priority = 2,invocationCount = 2)
	
	private  void MadrasUniv() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI\\eclipse-workspace\\Data_Driven\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.unom.ac.in/");
		driver.manage().window().maximize();
	}
	@Test(priority = 1,invocationCount = 3)
	private void AnnaUniv() {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\SHALINI\\eclipse-workspace\\Data_Driven\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.annauniv.edu/");
		driver.manage().window().maximize();

	}
		
		
		
	}
