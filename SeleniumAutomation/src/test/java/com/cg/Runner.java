package com.cg;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// load url
		driver.get("https://www.google.com");

		System.out.println("current url : " + driver.getCurrentUrl());

		System.out.println("title of page : " + driver.getTitle());

//		  WebElement textBox = driver.findElement(By.xpath(
//		  "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
//		  
//		  textBox.sendKeys("Selenium");
//		  
//		  textBox.submit();
		
//		WebElement images = driver.findElement(By.linkText("Images"));
//		
//		images.click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("total number of links : "+links.size());
		
		Iterator<WebElement> it = links.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getText());
		}

		Thread.sleep(3000);
		driver.quit();
	}

}
