package com.cg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name = "login")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "commit")
	WebElement submit;
	
	@FindBy(xpath = "//*[@id=\"login\"]/div[4]/form/div/a")
	WebElement forgotPassword;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public HomePage logIn(String uName, String uPassword) {
		username.sendKeys(uName);
		password.sendKeys(uPassword);
		return new HomePage();
	}
	public ForgotPasswordPage forgotPassword() {
		forgotPassword.click();
		return new ForgotPasswordPage();	
	}

}
