package com.ebrahim.hossain.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ebrahim.hossain.BaseDriver;

public class AlertExamples extends BaseDriver {

//	@Test
	public void alerts() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		// Xpath - And function -> //tagName[@attribute='value' and @attribute2='value'
		// and....]
		WebElement first_alert = driver
				.findElement(By.xpath("//button[contains(text(),'Alert') and @class='btn btn-primary']"));
		first_alert.click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);

	}

	//@Test
	public void alertExample2() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		// Xpath - And function -> //tagName[@attribute='value' and @attribute2='value'
		// and....]
		WebElement element = driver
				.findElement(By.xpath("// button[contains(text(),'Click Me') and @onclick='myDesk()']"));
		element.click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
//		alert.accept();
		alert.dismiss();
		Thread.sleep(5000);

	}
	
	@Test
	public void alertExample3() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement element = driver
				.findElement(By.xpath("//button[@id='promtButton']"));
		element.click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hello....");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(5000);

	}
	
}
