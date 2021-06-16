package com.cognixia.training.MavenTestNGSelenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class JqueryDraganddrop extends Base{

	public static void main(String[] args) {
		
		openBrowser("Chrome");
		
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		
		//The pointer (driver) changes to frame area
		
		WebElement slider = driver.findElement(By.id("slider"));
		
		int maxXoffset = slider.getSize().width;
		System.out.println(maxXoffset);
		
		WebElement handle = driver.findElement(By.tagName("span"));
		Actions myaction = new Actions(driver);
		
		myaction.dragAndDropBy(handle,maxXoffset/2, 0).build().perform();
		myaction.clickAndHold(handle).moveByOffset(maxXoffset/4, 0).release().build().perform();
	}

}
