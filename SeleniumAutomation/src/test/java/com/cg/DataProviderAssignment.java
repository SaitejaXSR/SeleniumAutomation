package com.cg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAssignment {
	WebDriver driver;
	
	@BeforeMethod
	public void init() {
		driver = GetWebDriver.getWebDriver();
		driver.get("https://prowessapps.in/testing/register");
	}
	
	@Test(dataProvider = "getData")
	public void fillForm(String fName, String lName, String email, String mobile, String gender, String hobbies, String skills, String address) throws NullPointerException {
//		WebDriverWait wait = new WebDriverWait(driver, 60);
//		wait.until(ExpectedConditions.elementToBeSelected(By.id("firstname")));
		
		driver.findElement(By.id("firstname")).sendKeys(fName);
		driver.findElement(By.name("lastname")).sendKeys(lName);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("mob")).sendKeys(mobile);
		driver.findElement(By.id(gender.toLowerCase())).click();
		driver.findElement(By.id(hobbies.toLowerCase())).click();
		Select s1 = new Select(driver.findElement(By.id("Skills")));
		s1.selectByVisibleText(skills);
		driver.findElement(By.id("address")).sendKeys(address);
	}
	
	
	@DataProvider
	public String[][] getData() throws IOException {
		String xLPath = "C:\\Users\\SAITHUMM\\eclipse-workspace\\SeleniumAutomation\\src\\test\\java\\com\\cg\\RegForm.xlsx";
		int rowCount = XLUtils.getRowCount(xLPath, "Sheet1");
		int colCount = XLUtils.getCellCount(xLPath, "Sheet1", 1);
		
		String[][] data = new String[rowCount][colCount];
		for(int i = 1 ; i<=rowCount; i++) {
			for(int j = 0 ; j<colCount ; j++) {
				data[i-1][j] = XLUtils.getCellData(xLPath, "Sheet1", i, j);
			}
		}
		return data;
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
