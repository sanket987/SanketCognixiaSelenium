package com.cognixia.training.MavenTestNGSelenium.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class MyntraMouseActionExample extends Base{

	public static void main(String[] args) {
		
		openBrowser("Chrome");
		
		driver.get("https://www.myntra.com");
		
		//Move my mouse to home and living menu item
		
		//1. Create the object of actions class
		Actions myActions = new Actions(driver);
		myActions.moveToElement(driver.findElement(By.xpath("//a[text()='Home & Living' and @class='desktop-main']")));
		myActions.pause(5000);
		myActions.moveToElement(driver.findElement(By.xpath("//a[text()='Men' and @class='desktop-main']")));
		//2. Create the object of action class and build the actions
		
		Action myAction = myActions.build();
		
		myAction.perform();
	}

}
