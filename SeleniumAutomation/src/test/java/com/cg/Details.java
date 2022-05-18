package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Details {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://prowessapps.in/testing/register");
		WebElement fName = driver.findElement(By.name("firstname"));
		fName.sendKeys("Sai teja chary");
		
		WebElement lName = driver.findElement(By.name("lastname"));
		lName.sendKeys("Thummalapally");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("saitejacha@gmail.com");
		
		WebElement mobile = driver.findElement(By.name("mob"));
		mobile.sendKeys("9063109656");
		
		WebElement gender = driver.findElement(By.id("male"));
		gender.click();
		
		WebElement hobby1 = driver.findElement(By.name("cricket"));
		hobby1.click();
		
		WebElement hobby2 = driver.findElement(By.name("movies"));
		hobby2.click();
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select s1 = new Select(skills);
		s1.selectByVisibleText("Java");
		
		WebElement day = driver.findElement(By.id("day"));
		Select s2 = new Select(day);
		s2.selectByVisibleText("14");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s3 = new Select(month);
		s3.selectByVisibleText("November");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s4 = new Select(year);
		s4.selectByVisibleText("1998");
		
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("pjr pg talwadegaon, talwade, pimpri-chinchwad, maharashtra, 411062");
		
		Thread.sleep(3000);
		
		WebElement register = driver.findElement(By.xpath("/html/body/div[1]/div[1]/form/div[9]/div[2]/button"));
		register.click();
		
		driver.quit();  
		
		
	}

}
