package com.ebrahim.hossain.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ebrahim.hossain.BaseDriver;

public class MouseHover extends BaseDriver{
	
	@BeforeClass
	public void openURL() {
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/");
	}
	
	@Test
	public void hover() throws InterruptedException {
		
		Actions action  = new Actions(driver);
		
		WebElement tv_and_home = driver.findElement(By.xpath("//span[contains(text(),'TV & Home Appliances')]"));
		action.moveToElement(tv_and_home).perform();
		Thread.sleep(2000);
		
		WebElement television = driver.findElement(By.xpath("//ul[@class='lzd-site-menu-root']/ul[7]/li[1]/a/span"));
		action.moveToElement(television).perform();
		Thread.sleep(3000);
		
		WebElement oled_televisions = driver.findElement(By.xpath("//span[contains(text(),'OLED Televisions')]"));
		oled_televisions.click();
		Thread.sleep(5000);
	}

}
