package com.cg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClick {
	static Alert alert;
	public static void main(String[] args) {
		WebDriver driver = GetWebDriver.getWebDriver();
		driver.get("https://prowessapps.in/testing/actions");
		
		WebElement rightClick = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/span[1]"));
		Actions action = new Actions(driver);
		action.contextClick(rightClick).perform();
		action.sendKeys(Keys.ARROW_DOWN).perform();
		action.sendKeys(Keys.ENTER).perform();
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		WebElement doubleClick = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/span[2]"));
		action.doubleClick(doubleClick).perform();
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		WebElement hover = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/button"));
		action.moveToElement(hover).perform();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/a[1]")).click();		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}

}
