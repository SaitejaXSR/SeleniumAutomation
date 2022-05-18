package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImplicitWait {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = GetWebDriver.getWebDriver();
		driver.get("https://www.prowessapps.in/testing");
		
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/ul/li[1]/a")).click();
		
		driver.findElement(By.id("loadAfterSeconds")).sendKeys("sai teja");
		driver.findElement(By.id("middleName")).sendKeys("chary");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/span[2]/input")).sendKeys("Thummalapally");
		Thread.sleep(2000);
		driver.quit();
	}

}
