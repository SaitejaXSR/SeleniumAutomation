package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = GetWebDriver.getWebDriver();
		driver.get("http://www.google.com");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("apple");
		search.submit();
		WebElement firstLink = driver.findElement(By.xpath("//*[@id=\"tads\"]/div/div/div/div/div[1]/a/div[1]/span"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(firstLink));
		firstLink.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
