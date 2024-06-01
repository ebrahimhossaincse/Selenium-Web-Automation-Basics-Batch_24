package com.ebrahim.hossain.webelements;

import org.testng.annotations.Test;

import com.ebrahim.hossain.BaseDriver;

public class BrowserCommands extends BaseDriver{
	
	@Test
	public void browserCommandExamples() {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "elenium Practice - Student Registration Form";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println(driver.getTitle());
		}else {
			System.out.println("Not match");
		}
		
		System.out.println(driver.getCurrentUrl());
	}

}
