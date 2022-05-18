package com.cg;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = GetWebDriver.getWebDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("travel_from")).sendKeys("Alexandria International Airport (Louisiana) (AEX) Alexandria");
		driver.findElement(By.name("travel_to")).sendKeys("Aniak Airport (ANI) Aniak");
		
		LocalDate lDate = LocalDate.now().plusDays(7);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		String bDate = lDate.format(format);
		driver.findElement(By.name("travel_date")).sendKeys(bDate);
		new Select(driver.findElement(By.id("travel_airline"))).selectByVisibleText("Air India");
		new Select(driver.findElement(By.id("travel_language"))).selectByVisibleText("Telugu");
		driver.findElement(By.xpath("//*[@id=\"searchform\"]/div[3]/div[2]/div/button")).click();
		
		driver.quit();
	}
}
