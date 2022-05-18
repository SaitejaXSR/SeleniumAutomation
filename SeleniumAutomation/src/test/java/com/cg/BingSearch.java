package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSearch {
		
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.name("q"));
		
		text.sendKeys("capgemini india");
		
		text.submit();
		
		System.out.println("Address : "+driver.findElement(By.xpath("//*[@id=\"elc_eid_YN4070x14914319990864863163\"]/div/div/div[2]/span[2]/div[2]")).getText());
		
		driver.quit();
		
	}
}
