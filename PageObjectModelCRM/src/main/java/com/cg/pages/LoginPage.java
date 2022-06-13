package com.cg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginBtn;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div/div[1]/a")
	WebElement forgotPassword;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String validateLoginpageTitle() {
		return driver.getTitle();
	}
	public HomePage logIn(String uname, String upassword) {
		username.sendKeys(uname);
		password.sendKeys(upassword);
		loginBtn.click();
		return new HomePage();
	}
	public ForgotPasswordPage forgotPassword() {
		forgotPassword.click();
		return new ForgotPasswordPage();
	}

}
