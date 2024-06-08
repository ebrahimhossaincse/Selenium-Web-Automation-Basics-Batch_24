package com.ebrahim.hossain.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ebrahim.hossain.BaseDriver;

public class ExplicitWait extends BaseDriver{
	
	@BeforeClass
	public void openURL() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		Thread.sleep(3000);
	}
	
	@Test
	public void explicitWait() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstnam")));
		WebElement first_name = driver.findElement(By.id("firstname"));
		first_name.sendKeys("Ebrahim");
		Thread.sleep(5000);
	}
}
