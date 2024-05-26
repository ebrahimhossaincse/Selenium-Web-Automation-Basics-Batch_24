package com.ebrahim.hossain.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.ebrahim.hossain.BaseDriver;

public class LocateById extends BaseDriver{
	
	@BeforeClass
	public void openURL() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
	}
	
	@Test
	public void locateByID() throws InterruptedException {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("test@gmail.com");
		Thread.sleep(5000);
	}
	

}
