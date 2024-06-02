package com.ebrahim.hossain.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ebrahim.hossain.BaseDriver;

public class SelectExamples extends BaseDriver {
	@BeforeClass
	public void openURL() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		Thread.sleep(3000);
	}
	
	@Test
	public void selectExamples() throws InterruptedException {
		WebElement state_and_city = driver.findElement(By.id("state"));
		Select select = new Select(state_and_city);
		
		//Select by Index
		select.selectByIndex(2);
		Thread.sleep(5000);
		
		//select by value
		select.selectByValue("Rajasthan");
		Thread.sleep(5000);
		
		//select by Visible Test
		select.selectByVisibleText("NCR");
		Thread.sleep(5000);
		
		//De-select
		select.deselectByVisibleText("NCR");
		Thread.sleep(5000);
	}
}
