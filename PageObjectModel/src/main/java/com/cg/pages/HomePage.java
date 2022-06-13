package com.cg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cg.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//*[@id=\"global-nav\"]/a[2]")
	WebElement pullRequests;
	
	@FindBy(xpath = "//*[@id=\"global-nav\"]/a[3]")
	WebElement issues;
	
	@FindBy(xpath = "/html/body/div[1]/header/div[7]/details/summary/span[2]")
	WebElement dropDown;

}
