package com.cognixia.training.MavenTestNGSelenium.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class FindElements extends Base{

	public static void main(String[] args) throws InterruptedException {
		openBrowser("Chrome");
		driver.get("https://www.google.com");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("selenium");
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erKvQe']//span/b"));
		
		for(WebElement l :list) {
			System.out.println("se"+l.getText());
		}
		driver.close();
		
		

	}

}
