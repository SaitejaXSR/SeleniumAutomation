package com.cg.testdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.cg.driver.GetWebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleImageSearchTestDef {
	
	WebDriver driver;
	@When("user clicks on images link")
	public void userClicksOnImagesLink()  {
		try {
		driver.findElement(By.linkText("Images")).click();
		}catch (NullPointerException e) {
			driver = GetWebDriver.getWebDriver();
			driver.get("https://www.google.com");
			driver.findElement(By.linkText("Images")).click();
		}
	}
	@Then("user should be on google images page")
	public void userShouldBeOnGoogleImagesPage() {
	    Assert.assertEquals("Google Images", driver.getTitle());
	}
	@When("user searches for rose in search bar")
	public void userSearchesForRoseInSearchBar() {
	    driver.findElement(By.name("q")).sendKeys("rose");
	}
	@When("user clicks search button")
	public void userClicksSearchButton() {
	    driver.findElement(By.name("q")).submit();
	}
	@Then("multiple images should be dispalyed")
	public void multipleImagesShouldBeDispalyed() {
	    Assert.assertEquals("rose - Google Search", driver.getTitle());
	}
	@Then("user closes the browser")
	public void userClosesTheBrowser() {
	    driver.close();
	}


}
