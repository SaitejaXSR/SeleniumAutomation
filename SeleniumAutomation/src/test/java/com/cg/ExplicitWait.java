package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		
		WebDriver driver = GetWebDriver.getWebDriver();
		driver.get("https://www.prowessapps.in/testing");
		
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/ul/li[2]/a")).click();
		driver.findElement(By.id("loadAfterSeconds1")).sendKeys("12345");
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"otpbtn1\"]"))));
		
		driver.findElement(By.id("otpbtn")).click();
		driver.quit();
	}

}
