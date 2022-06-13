package com.cg.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cg.base.TestBase;
import com.cg.pages.ForgotPasswordPage;
import com.cg.pages.LoginPage;

public class ForgotPasswordPageTest extends TestBase {
	
	ForgotPasswordPage forgotPasswordPage;
	LoginPage loginPage;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		forgotPasswordPage = loginPage.forgotPassword();
	}
	@Test
	public void resetPasswordTest() {
		String msg = forgotPasswordPage.resetPassword(prop.getProperty("username"));
		assertEquals(msg, "Thank you. If this account is registered you will receive an email with a password reset link.");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
