package com.ebrahim.hossain;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExamples {
	
	@BeforeSuite
	public void beforeSuiteExample() {
		System.out.println("Before Suite...");
	}
	
	@Test (priority = 1)
	public void testExample() {
		System.out.println("Test...1");
	}
	
	@Test (priority = 0)
	public void testExample2() {
		System.out.println("Test...2");
	}
	@AfterSuite
	public void afterSuiteExample() {
		System.out.println("After Suite...");
	}
	
	@BeforeClass
	public void beforeClassExample() {
		System.out.println("Before Class...");
	}

	@AfterClass
	public void afterClassExample() {
		System.out.println("After Class...");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
}
