package com.ebrahim.hossain;

import org.testng.annotations.Test;

public class OpenUrl extends BaseDriver{
	
	@Test
	public void open() throws InterruptedException {
		driver.get("https://www.selenium.dev/downloads/");	
		Thread.sleep(5000);
	}
}
