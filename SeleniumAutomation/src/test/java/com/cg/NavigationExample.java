package com.cg;

import org.openqa.selenium.WebDriver;

public class NavigationExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = GetWebDriver.getWebDriver();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.myntra.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
