package com.cg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwitchToAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = GetWebDriver.getWebDriver();
		
		driver.get("https://prowessapps.in/testing/alerts");
		
		driver.findElement(By.id("alertwithok")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		alert.accept();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"b\"]/a")).click();
		driver.findElement(By.id("alertwithokandcancel")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		System.out.println(driver.findElement(By.id("messagefromalert")).getText());
		Thread.sleep(2000);
		
		driver.findElement(By.id("alertwithokandcancel")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		System.out.println(driver.findElement(By.id("messagefromalert")).getText());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"c\"]/a")).click();
		driver.findElement(By.id("alertwithtextbox")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Sai teja chary");
		alert3.accept();
		System.out.println(driver.findElement(By.id("messagefromalert")).getText());
		Thread.sleep(2000);
		
		driver.findElement(By.id("alertwithtextbox")).click();
		Alert alert4 = driver.switchTo().alert();
		alert4.sendKeys("Sai teja chary");
		alert4.dismiss();
		System.out.println(driver.findElement(By.id("messagefromalert")).getText());
		
		driver.quit();
	}

}
