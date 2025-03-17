package com.opencart.testcases;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencart.pageobjects.LoginPage;
import com.opencart.testbase.BaseTest;
import com.opencart.utilities.ExcelUtils;

public class LoginTest extends BaseTest {

	
	@Test (dataProvider = "logindata")
	public void loginTest(String email, String password) {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterEmail(email);
		loginpage.enterPassword(password);
		loginpage.clickLogin();
	}

	@DataProvider (name = "logindata")
	public Object[][] fetchData() throws IOException {
		return ExcelUtils.getData("C:\\Users\\MANISHA\\eclipse-workspace\\Opencart_Automation\\testData\\LoginData.xlsx", "Sheet1");
	}
}
