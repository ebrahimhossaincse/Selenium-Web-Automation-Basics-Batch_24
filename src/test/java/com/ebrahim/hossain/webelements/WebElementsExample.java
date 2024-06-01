package com.ebrahim.hossain.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ebrahim.hossain.BaseDriver;

public class WebElementsExample extends BaseDriver{
	
	@Test (priority = 1)
	public void sendKeyExample() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Ebrahim");
		Thread.sleep(5000);
	}
	
	@Test (priority = 0)
	public void clickExample() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		WebElement element = driver.findElement(By.xpath("//input[@id='gender']"));
		element.click();
		Thread.sleep(5000);
	}

	@Test (priority = 4)
	public void clearExample() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Ebrahim");
		Thread.sleep(5000);
		firstName.clear();
		Thread.sleep(3000);
		firstName.sendKeys("Ebrahim");
		Thread.sleep(5000);
	}

	@Test (priority = 3)
	public void getAttributeExample() {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		System.out.println(firstName.getAttribute("placeholder"));
	}


}
