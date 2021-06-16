package com.cognixia.training.MavenTestNGSelenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class FrameDragDropExample2 extends Base {

	public static void main(String[] args) {
		openBrowser("Chrome");
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		
		//The pointer (driver) changes to frame area
		
		WebElement slider = driver.findElement(By.id("slider"));
		WebElement handle = driver.findElement(By.tagName("span"));
		
		//step1 - define the actions
		
		Actions myactions = new Actions(driver);
		myactions.clickAndHold(handle);
		myactions.moveByOffset(200, 0);
		myactions.release();
		
		//step2 - Build the Actions - package the code together
		Action action = myactions.build();
		
		//step3 - perform the actions - run all the lines of code together
		action.perform();
	}

}
