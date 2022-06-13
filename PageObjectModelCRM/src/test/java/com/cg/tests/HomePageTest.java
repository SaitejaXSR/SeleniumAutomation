package com.cg.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cg.base.TestBase;
import com.cg.pages.CalendarPage;
import com.cg.pages.ContactsPage;
import com.cg.pages.DealsPage;
import com.cg.pages.HomePage;
import com.cg.pages.LoginPage;
import com.cg.pages.TasksPage;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	CalendarPage calendarPage;
	ContactsPage contactsPage;
	DealsPage dealsPage;
	TasksPage tasksPage;
	LoginPage loginPage;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void validateHomePageTest() {
		String title = homePage.validateHomePage();
		assertEquals(title, "Cogmento CRM");
	}
	@Test(priority = 2)
	public void CalendarLinkTest() {
		calendarPage = homePage.clickOnCalendarLink();
	}
	@Test(priority = 3)
	public void ContactsLinkTest() {
		contactsPage = homePage.clickContactsLink();
	}
	@Test(priority = 4)
	public void DealsLinkTest() {
		dealsPage = homePage.clickDealsLink();
	}
	@Test(priority = 5)
	public void TasksLinkTest() {
		tasksPage = homePage.clickTasksLink();
	}
	@Test(priority = 6)
	public void userLabelTest() {
		assertTrue(homePage.verifyUserLabel());
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
