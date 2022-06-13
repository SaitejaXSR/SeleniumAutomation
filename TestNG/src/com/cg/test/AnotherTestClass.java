package com.cg.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnotherTestClass {
	
	@Test
	@Parameters({"user", "pwd"})
	public void login(String userName, String password) {
		System.out.println("UserName : "+userName+ " Password : "+password);
	}

}
