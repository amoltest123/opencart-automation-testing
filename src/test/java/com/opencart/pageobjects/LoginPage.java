package com.opencart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opencart.testbase.BasePage;

public class LoginPage extends BasePage {

	// Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	// Locators using @FindBy annotation

	@FindBy(css = "#input-email")
	WebElement emailFeild;

	@FindBy(css = "[placeholder^='Pass']")
	WebElement passwordField;

	@FindBy(css = "button.btn.btn-primary")
	WebElement loginButton;


	// Login page methods

	public void enterEmail(String email) {

		emailFeild.sendKeys(email);
	}

	public void enterPassword(String password) {

		passwordField.sendKeys(password);

	}

	public void clickLogin() {

		loginButton.click();
	}
}
