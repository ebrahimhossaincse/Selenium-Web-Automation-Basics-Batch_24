import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ebrahim.hossain.BaseDriver;

public class Example1 extends BaseDriver{
	
	public void example(String name) {
		
		Set<WebElement> tabs = (Set<WebElement>) driver.findElements(By.xpath("//ul[@class='tabs']/li"));
		
		for(int i=1; i <= tabs.size(); i++) {
			WebElement tab_text = driver.findElement(By.xpath("//ul[@class='tabs']/li["+i+"]/a/span[1]"));
			if(tab_text.getText().equals(name)) {
				WebElement tab = driver.findElement(By.xpath("//ul[@class='tabs']/li["+i+"]/a]"));
				tab.click();
			}
		}
		
	}

}
