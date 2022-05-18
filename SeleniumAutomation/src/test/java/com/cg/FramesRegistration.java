package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesRegistration {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = GetWebDriver.getWebDriver();
		driver.get("https://prowessapps.in/testing/framesExample");
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/iframe")));
		driver.findElement(By.id("regid")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/iframe")));
		driver.findElement(By.name("firstname")).sendKeys("Sai teja chary");
		driver.findElement(By.name("lastname")).sendKeys("Thummalapally");
		driver.findElement(By.name("email")).sendKeys("sai@gmail.com");
		driver.findElement(By.name("mob")).sendKeys("+919063109656");
		driver.findElement(By.id("male")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[1]/form/div[5]/div[2]/button")).click();
	}

}
