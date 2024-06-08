package com.ebrahim.hossain.tabwindow;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ebrahim.hossain.BaseDriver;

public class TabHandling extends BaseDriver {

	@BeforeClass
	public void openURL() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
		Thread.sleep(3000);
	}

	@Test
	public void tab() throws InterruptedException {
		
		String parentTab = driver.getWindowHandle();
		
		//Create a New Tab
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		String childTab = driver.getWindowHandle();
		driver.get("https://www.daraz.com.bd/#hp-categories");
		Thread.sleep(2000);
		
		//Switch to Tab
		Set<String> allTabs = driver.getWindowHandles();
		System.out.println("Number of Tab: "+allTabs.size());
		
		driver.switchTo().window(parentTab);
		Thread.sleep(2000);
		driver.switchTo().window(childTab);
		Thread.sleep(2000);
	}
}
