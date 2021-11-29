package com.org;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task7 {
	@Test
	private void Madras_Univ() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHALINI\\eclipse-workspace\\Data_Driven\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.unom.ac.in/");
		driver.manage().window().maximize();
	}

	@Test
	private void Anna_Univ() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHALINI\\eclipse-workspace\\Data_Driven\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.annauniv.edu/");
		driver.manage().window().maximize();
	}

}
