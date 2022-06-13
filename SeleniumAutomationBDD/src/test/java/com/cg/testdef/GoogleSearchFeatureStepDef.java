package com.cg.testdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cg.driver.GetWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleSearchFeatureStepDef {
	
	WebDriver driver;
	@Given("user should be on google search page")
	public void user_should_be_on_google_search_page() {
	    driver = GetWebDriver.getWebDriver();
	    driver.get("https://www.google.com");
	}
	@When("user enters any topic into search box")
	public void user_enters_any_topic_into_search_box() {
	    driver.findElement(By.name("q")).sendKeys("Selenium");
	}
	@When("click on google search button")
	public void click_on_google_search_button() {
	    driver.findElement(By.name("q")).submit();
	}
	@Then("multiple link s should be available on the given topic")
	public void multiple_link_s_should_be_available_on_the_given_topic() {
	    Assert.assertEquals("Selenium - Google Search", driver.getTitle());
	}
	@Then("user should close the browser")
	public void userShouldCloseTheBrowser() {
	    driver.close();
	}


}
