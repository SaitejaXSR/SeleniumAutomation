package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	
	public static void main(String[] args) {
		WebDriver driver = GetWebDriver.getWebDriver();
		driver.get("https://www.myntra.com");
		
		WebElement menSection =  driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(menSection).build().perform();
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/div/div/div/li[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label/div")).click();
		driver.quit();
	}

}
