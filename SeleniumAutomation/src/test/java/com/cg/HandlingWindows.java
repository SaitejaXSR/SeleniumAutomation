package com.cg;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HandlingWindows {
	public static void main(String[] args) {
		
		WebDriver driver = GetWebDriver.getWebDriver();
		driver.get("https://www.shoppersstop.com/");
		
		driver.findElement(By.xpath("/html/body/main/header/nav/div[1]/div/ul[2]/li[3]/a")).sendKeys(Keys.CONTROL , Keys.RETURN);
		driver.findElement(By.xpath("/html/body/main/header/nav/div[1]/div/ul[2]/li[4]/a")).sendKeys(Keys.CONTROL , Keys.RETURN);
		driver.findElement(By.xpath("/html/body/main/header/nav/div[1]/div/ul[2]/li[5]/a")).sendKeys(Keys.CONTROL , Keys.RETURN);
		driver.findElement(By.xpath("/html/body/main/header/nav/div[1]/div/ul[2]/li[6]/a")).sendKeys(Keys.CONTROL , Keys.RETURN);
		driver.findElement(By.xpath("/html/body/main/header/nav/div[1]/div/ul[2]/li[7]/a")).sendKeys(Keys.CONTROL , Keys.RETURN);
		
		ArrayList<String> webId = new ArrayList<String>(driver.getWindowHandles());
		for(int i = 0; i<webId.size(); i++) {
			System.out.println(driver.switchTo().window(webId.get(i)).getTitle());
		}
		driver.quit();
	}

}
