package com.cg;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	@Test(dataProvider = "getData")
	public void loginTest(String username, String password) {
		System.out.println(username+" "+password);
	}
	
	@DataProvider
	public String[][] getData() throws IOException {
		String xLPath = "C:\\Users\\SAITHUMM\\eclipse-workspace\\SeleniumAutomation\\src\\test\\java\\com\\cg\\user.xlsx";
		
		int rowCount = XLUtils.getRowCount(xLPath, "Sheet1");
		int colCount = XLUtils.getCellCount(xLPath, "Sheet1", 1);
		
		String [][] userData = new String [rowCount][colCount];
		
		for(int i = 1 ; i<=rowCount; i++){
			for(int j = 0; j<colCount; j++) {
				userData[i-1][j] = XLUtils.getCellData(xLPath, "Sheet1", i, j);
			}
		}
		return userData;
		
	}
}
