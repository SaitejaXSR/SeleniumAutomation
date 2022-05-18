package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop {
	
	public static void main(String[] args) {
		WebDriver driver = GetWebDriver.getWebDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement amount = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement debitAmount = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement bankAccount = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement salesAccount = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement creditAmount = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		WebElement debitAccountHolder = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement creditAccountHolder = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		Actions action = new Actions(driver);
		action.clickAndHold(amount).moveToElement(debitAmount).release().perform();
		action.dragAndDrop(amount, creditAmount).perform();
		action.dragAndDrop(bankAccount, debitAccountHolder).perform();
		action.dragAndDrop(salesAccount, creditAccountHolder).perform();
		driver.quit();

	}

}
