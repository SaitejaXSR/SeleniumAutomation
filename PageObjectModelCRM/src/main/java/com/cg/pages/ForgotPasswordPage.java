package com.cg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.base.TestBase;

public class ForgotPasswordPage extends TestBase {
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "action")
	WebElement resetPasswordBtn;
	
	@FindBy(xpath = "/html/body/div/div/div/div/div/form/div")
	WebElement resetPasswordMsg;
	
	public ForgotPasswordPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String resetPassword(String username) {
		email.sendKeys(username);
		resetPasswordBtn.click();
		return resetPasswordMsg.getText();
	}

}
