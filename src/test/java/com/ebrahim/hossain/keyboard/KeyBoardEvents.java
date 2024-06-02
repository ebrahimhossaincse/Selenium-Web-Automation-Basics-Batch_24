package com.ebrahim.hossain.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ebrahim.hossain.BaseDriver;

public class KeyBoardEvents extends BaseDriver{
	
	@BeforeClass
	public void openURL() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		Thread.sleep(3000);
	}
	
	@Test
	public void copyAndPaste() throws InterruptedException {
		Actions action = new Actions(driver);
		
		WebElement first_name = driver.findElement(By.xpath("//input[@id='firstname']"));
		first_name.sendKeys("Ebrahim");
		
		//Copy - CTRL+A
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		Thread.sleep(3000);
		
		//TAB
		action.sendKeys(Keys.TAB);
		action.build().perform();
//		Thread.sleep(3000);
		
		//Paste
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		Thread.sleep(3000);
	}

}
