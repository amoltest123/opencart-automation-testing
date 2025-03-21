package com.opencart.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.opencart.pageobjects.RegistrationPage;
import com.opencart.testbase.BaseTest;

public class RegistrationTest extends BaseTest {
	@Test
	public void registrationTestMethod() {
		RegistrationPage rp = new RegistrationPage(driver);
		rp.enterFirstName("ram");
		rp.enterLastName("ashtwakra");
		rp.enterEmail("abc123@gmail.com");
		rp.enterPassword("kuqwd545@");
		rp.clickContinueButton();
	}
}
}
