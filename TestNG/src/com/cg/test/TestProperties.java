package com.cg.test;

import org.testng.annotations.Test;

public class TestProperties {
	
	@Test(priority = 2)
	public void test1() {
		System.out.println("test1");
	} 
		/*
		 * we can set priority to test cases according to our requirement 
		 * if not set the testng runs the test methods in alphabetical order.
		 */
	@Test(priority = 1)
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void googleLogoTest() {
		System.out.println("google logo test"+1/0);
	}
	@Test(dependsOnMethods = "googleLogoTest") //if above method(googleLogoTest) passes 
	public void googleTitleTest() {			  //then this test case will run
		System.out.println("google title test");
	}
}
