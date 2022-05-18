package com.cg;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BingLinks {
	
	public static void main(String[] args) {
		
		WebDriver driver = GetWebDriver.getWebDriver();
		
		driver.get("https://www.bing.com/");
		List<WebElement> links =  driver.findElements(By.tagName("a"));
		System.out.println("no of links present : "+links.size());
		
		Iterator<WebElement> it = links.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getText());
		}
		driver.close();
	}

}
