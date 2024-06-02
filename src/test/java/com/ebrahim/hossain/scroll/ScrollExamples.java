package com.ebrahim.hossain.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ebrahim.hossain.BaseDriver;

public class ScrollExamples extends BaseDriver{
	
	@BeforeClass
	public void openURL() {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/scroll-down.php");
	}
	
	@Test (priority = 0)
	public void scrollDown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(5000);
	}
	
	@Test (priority = 1)
	public void scrollUp() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0);");
		Thread.sleep(5000);
	}
	
	@Test (priority = 2)
	public void scrollSpecific() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//h3[normalize-space()='Where can I get some?']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(5000);
	}
}
