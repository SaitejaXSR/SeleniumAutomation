package com.cg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotExample {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = GetWebDriver.getWebDriver();
		driver.get("https://www.google.com");
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\SAITHUMM\\eclipse-workspace\\SeleniumAutomation\\target\\google.png");
		FileUtils.copyFile(src, dest);
		driver.close();
	}

}
