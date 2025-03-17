package com.opencart.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	// Define a WebDriver instance
	WebDriver driver;

	// Constructor to initialize PageFactory elements
	public BasePage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

}
