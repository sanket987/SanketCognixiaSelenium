package com.cognixia.training.MavenTestNGSelenium.tests;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class MultipleWindowsExample extends Base {

	public static void main(String[] args) {
		openBrowser("Chrome");
		driver.get("https://register.rediff.com/register/register.php");
		
		String mainWindowhandle = driver.getWindowHandles();
		
		driver.findElement(By.linkText("privacy policy")).click();
		//still driver is pointing to main window
		driver.findElement(By.linkText("terms and conditions")).click();
		//still driver is pointing to main window
		
		//switch the control to new window
		Set<String> handles = driver.getWindowHandles();
		
		System.out.println("No. of windows open:"+handles.size());
		
		Iterator<String> iter = handles.iterator();
		
		while(iter.hasNext()) {
			String handle = iter.next();
			driver.switchTo().window(handle);
			if(driver.getTitle().contains("Terms and Conditions")){
				break;
			}
		}
		
		//driver is pointing to terms and conditions window
		String header = driver.findElement(By.xpath("//div[@class='header']/div")).getText();
		
		String expected = "Terms and Conditions";
		
		if(header.equals(expected)) {
			System.out.println("I am Happy!");
		}else {
			System.out.println("I am not happy");
		}
		
		//before this line 
		driver.switchTo().window(mainwindowhandle);
	}

}
