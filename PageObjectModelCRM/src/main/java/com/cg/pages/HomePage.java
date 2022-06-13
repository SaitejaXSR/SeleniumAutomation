package com.cg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//*[@id=\"top-header-menu\"]/div[2]/span[1]")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//*[@id=\"main-nav\"]/div[2]/a/i")
	WebElement calendarIcon;
	
	@FindBy(xpath = "//*[@id=\"main-nav\"]/div[3]/a/i")
	WebElement contactsIcon;
	
	@FindBy(xpath = "//*[@id=\"main-nav\"]/div[5]/a/i")
	WebElement dealsIcon;
	
	@FindBy(xpath = "//*[@id=\"main-nav\"]/div[6]/a/span")
	WebElement tasksIcon;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePage() {
		return driver.getTitle();
	}
	public CalendarPage clickOnCalendarLink() {
		calendarIcon.click();
		return new CalendarPage();
	}
	public ContactsPage clickContactsLink() {
		contactsIcon.click();
		return new ContactsPage();
	}
	public DealsPage clickDealsLink() {
		dealsIcon.click();
		return new DealsPage();
	}
	public TasksPage clickTasksLink() {
		tasksIcon.click();
		return new TasksPage();
	}
	public boolean verifyUserLabel() {
		return userNameLabel.isDisplayed();
	}
}

