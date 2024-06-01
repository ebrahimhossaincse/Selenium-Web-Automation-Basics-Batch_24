package com.ebrahim.hossain.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ebrahim.hossain.BaseDriver;

public class RelativeXpathExamples extends BaseDriver{
	
	// -> //TagName[@attribute='value']
	// -> //*[@attribute='value']
	
	//@Test
	public void relativeXpath() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Ebrahim");
		Thread.sleep(5000);
	}
	
	
	@Test
	public void relativeXpathExample2() {
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd");
		WebElement flashSale = driver.findElement(By.xpath("//*[@class='page regional_bd']/div[4]/div[1]/h3"));
		System.out.println(flashSale.getText());
	}

}
