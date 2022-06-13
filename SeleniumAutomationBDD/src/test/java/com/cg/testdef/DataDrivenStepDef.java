package com.cg.testdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cg.driver.GetWebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataDrivenStepDef {
	
	WebDriver driver = GetWebDriver.getWebDriver();
	
	@When("user enters {string} into search text box")
	public void userEntersIntoSearchTextBox(String string) {
	   driver.get("https://www.google.com");
	   driver.findElement(By.name("q")).sendKeys(string);
	}
	@When("click the submit button")
	public void clickTheSubmitButton() {
		driver.findElement(By.name("q")).submit();
	}
	@Then("multiple result on {string} should be displayed")
	public void multipleResultOnShouldBeDisplayed(String string) {
	    String actual = driver.getTitle();
	    Assert.assertEquals(string+" - Google Search", actual);;
	}
	

}
