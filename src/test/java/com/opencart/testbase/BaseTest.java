package com.opencart.testbase;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {

	public WebDriver driver;
	public Logger logger;

	@BeforeMethod
	public void setUp() {
		
		logger = LogManager.getLogger(this.getClass());

		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void tearDown() {

		//driver.quit();
	}

}
