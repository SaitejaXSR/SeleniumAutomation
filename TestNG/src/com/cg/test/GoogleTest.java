package com.cg.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GoogleTest {
	
	@BeforeSuite
	public void setup() {
		System.out.println("setup system environment");
	}
	
	@BeforeClass
	public void init() {
		System.out.println("initialization method");
	}
	
	@BeforeMethod
	public void m1() {
		System.out.println("before method annotation");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("google title test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("google logo test");
	}
	
	@AfterMethod
	public void m2() {
		System.out.println("after method annotation");
	}
	
	@AfterClass
	public void m3() {
		System.out.println("after class annotation");
	}
	
	@AfterTest
	public void m4() {
		System.out.println("after test annotation");
	}
}
