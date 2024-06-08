package com.ebrahim.hossain.assertion;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ebrahim.hossain.BaseDriver;

public class HardAssertion extends BaseDriver{
	
	@BeforeClass
	public void openURL() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		Thread.sleep(3000);
	}
	
	@Test
	public void hardAssertion() {
		String expectedTitle = "Selenium Practice - Registe";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("Title: "+actualTitle);
	}

}
