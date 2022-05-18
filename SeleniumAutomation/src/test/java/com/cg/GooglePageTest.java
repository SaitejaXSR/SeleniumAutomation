package com.cg;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cg.GetWebDriver;

public class GooglePageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void init() {
		driver = GetWebDriver.getWebDriver();
		driver.get("https://www.google.com");		
	}
	@Test
	public void googleTitleTest() {
		String actualValue = driver.getTitle();
		assertEquals(actualValue, "Google");
	}
	@Test
	public void googleLogoTest() {
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		boolean actualValue = logo.isDisplayed();
		assertTrue(actualValue);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
