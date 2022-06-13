package com.cg.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cg.base.TestBase;
import com.cg.pages.ForgotPasswordPage;
import com.cg.pages.HomePage;
import com.cg.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ForgotPasswordPage forgotPassword;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void validLoginPageTest() {
		String title = loginPage.validateLoginpageTitle();
		assertEquals(title, "Cogmento CRM");
	}
	@Test(priority = 2)
	public void forgotPasswordLinkTest() {
		forgotPassword = loginPage.forgotPassword();
	}
	@Test(priority = 3)
	public void loginTest() {
		homePage = loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
		assertNotNull(homePage);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
