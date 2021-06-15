package com.cognixia.training.MavenTestNGSelenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class GlobalDragandDrop extends Base {

	public static void main(String[] args) {
		openBrowser("Chrome");
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.switchTo().frame(0);
		WebElement imagetodrag = driver.findElement(By.xpath("//ul[@id='gallery']//img[1]"));
		
		WebElement trash = driver.findElement(By.id("trash"));
		
		new Actions(driver).dragAndDrop(imagetodrag, trash).build().perform();
	}

}
