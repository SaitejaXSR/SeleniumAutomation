package com.cg.testdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cg.driver.GetWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GithubLoginFeatureTestDef {
	
	WebDriver driver;
	
	@Given("user is on github page")
	public void userIsOnGithubPage() {
	    driver = GetWebDriver.getWebDriver();
	    driver.get("https://www.github.com");
	}
	@When("user clicks on sign in link")
	public void userClicksOnSignInLink() {
	    driver.findElement(By.linkText("Sign in")).click();
	}
	@Then("user will be on sign in page")
	public void userWillBeOnSignInPage() {
	   Assert.assertEquals("Sign in to GitHub · GitHub", driver.getTitle());
	}
	@When("user enters correct username")
	public void userEntersCorrectUsername() {
	    driver.findElement(By.name("login")).sendKeys("SaitejaXSR");
	}
	@When("enters correct password")
	public void entersCorrectPassword() {
	    driver.findElement(By.name("password")).sendKeys("Saiteja@1411");
	}
	@When("click on sign in button")
	public void clickOnSignInButton() {
	    driver.findElement(By.name("commit")).click();
	}
	@Then("user should enter into his github account successfully")
	public void userShouldEnterIntoHisGithubAccountSuccessfully() {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary")).click();
		Assert.assertEquals("Signed in as SaitejaXSR", driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/details-menu/div[1]/a")).getText());
	}
	@Then("user closes the window")
	public void userClosesTheWindow() {
	    driver.close();
	}
	@When("user enters wrong username or password")
	public void userEntersWrongUsernameOrPassword() {
		 driver.findElement(By.name("login")).sendKeys("SaitejaXSR");
		 driver.findElement(By.name("password")).sendKeys("saiteja1411");
	}
	@Then("user should get failure message")
	public void userShouldGetFailureMessage() {
	   Assert.assertEquals("Incorrect username or password.", driver.findElement(By.xpath("//*[@id=\"js-flash-container\"]/div/div")).getText());
	}


}
