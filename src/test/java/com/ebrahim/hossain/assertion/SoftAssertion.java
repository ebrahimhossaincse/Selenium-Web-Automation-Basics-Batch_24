package com.ebrahim.hossain.assertion;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.ebrahim.hossain.BaseDriver;

public class SoftAssertion extends BaseDriver{
	
	@BeforeClass
	public void openURL() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		Thread.sleep(3000);
	}
	
	@Test
	public void softAssertion() {
		String expectedTitle = "Selenium Practice - Registe";
		String actualTitle = driver.getTitle();
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("Title: "+actualTitle);
		
		softAssert.assertAll();
	}

}
