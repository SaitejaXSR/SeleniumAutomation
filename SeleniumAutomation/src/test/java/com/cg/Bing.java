package com.cg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement images = driver.findElement(By.linkText("Images"));
		
		images.click();
		
		List<WebElement> image = driver.findElements(By.tagName("img"));
		System.out.println("no of images : "+image.size());
		
		driver.close();
	}

}
