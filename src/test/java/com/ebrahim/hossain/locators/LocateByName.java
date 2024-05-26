package com.ebrahim.hossain.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.ebrahim.hossain.BaseDriver;

public class LocateByName extends BaseDriver{
	
	@BeforeClass
	public void openURL() {
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void locateByName() throws InterruptedException {
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("test@gmail.com");
		Thread.sleep(5000);
	}
	

}
