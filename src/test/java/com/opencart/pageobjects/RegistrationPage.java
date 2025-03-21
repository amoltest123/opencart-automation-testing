package com.opencart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opencart.testbase.BasePage;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (xpath ="//input[@id='input-firstname']")
	WebElement firstNameField;

	@FindBy (xpath ="//input[@id='input-lastname']")
	WebElement lastNameField;

	@FindBy (xpath = "//input[@id='input-email']")
	WebElement emailField;

	@FindBy (css = "#input-password")
	WebElement passwordField;

	@FindBy (xpath = "//button[normalize-space (text())='Continue']")
	WebElement continueButton;

	public void enterFirstName(String firstName) {
		firstNameField.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}

	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	public void clickContinueButton() {
		continueButton.click();
	}

}
