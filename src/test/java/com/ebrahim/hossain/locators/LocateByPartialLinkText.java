package com.ebrahim.hossain.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.ebrahim.hossain.BaseDriver;

public class LocateByPartialLinkText extends BaseDriver{
	
	@BeforeClass
	public void openURL() {
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void locateByPartialLink() throws InterruptedException {
		WebElement forgetPassword = driver.findElement(By.partialLinkText("Forgotten"));
		forgetPassword.click();
		Thread.sleep(5000);
	}
	

}
