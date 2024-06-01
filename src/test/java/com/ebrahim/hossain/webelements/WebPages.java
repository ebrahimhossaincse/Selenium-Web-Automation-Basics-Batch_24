package com.ebrahim.hossain.webelements;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ebrahim.hossain.BaseDriver;

public class WebPages extends BaseDriver{
	
	@Test
	public void navigationTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		driver.findElement(By.xpath("//a[@href='https://www.tutorialspoint.com']")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
	}

}
