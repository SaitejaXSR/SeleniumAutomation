package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwitchToFrameExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = GetWebDriver.getWebDriver();
		driver.get("https://demo.guru99.com/selenium/deprecated.html");
		
		driver.switchTo().frame("classFrame");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/ul/li[6]/a")).click();
		
		driver.switchTo().defaultContent(); //switch to default frame
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}
