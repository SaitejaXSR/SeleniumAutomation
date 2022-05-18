package com.cg;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwitchToWindow2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = GetWebDriver.getWebDriver();
		driver.get("https://prowessapps.in/testing/");
		
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/center/a[2]")).click();
		Thread.sleep(2000);
		ArrayList<String> activeWindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(activeWindows.get(1));
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
