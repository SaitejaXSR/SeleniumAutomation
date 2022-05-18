package com.cg;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchToWindow {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = GetWebDriver.getWebDriver();
		
		driver.get("https://myntra.com");
		
		WebElement men = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a"));
//		WebElement women = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/a"));
//		WebElement kids = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/a"));
//		WebElement homeLiving = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[4]/div/a"));
//		WebElement beauty = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[5]/div/a"));
		
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.titleContains("Men"));
		
		
		men.sendKeys(Keys.chord(Keys.CONTROL , Keys.RETURN));
		
		FluentWait fWait = new FluentWait(driver);
		fWait.until(ExpectedConditions.titleContains("Men"));
		fWait.withTimeout(20 , TimeUnit.SECONDS);
		fWait.pollingEvery(5, TimeUnit.SECONDS);
		
//		women.sendKeys(Keys.chord(Keys.CONTROL , Keys.RETURN));
//		kids.sendKeys(Keys.chord(Keys.CONTROL , Keys.RETURN));
//		homeLiving.sendKeys(Keys.chord(Keys.CONTROL , Keys.RETURN));
//		beauty.sendKeys(Keys.chord(Keys.CONTROL , Keys.RETURN));
		
		Set<String> activeWindowIds = driver.getWindowHandles();
		for(String s : activeWindowIds) {
			driver.switchTo().window(s);
			System.out.println(s);
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
