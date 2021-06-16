package com.cognixia.training.MavenTestNGSelenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class GoogleSearch extends Base {
	
	

	public static void main(String[] args) throws InterruptedException 
	{
		
		//1. open the browser
		openBrowser("Chrome");
		
		//2. Naviagte to the url
		driver.get("https://www.google.com");
		
		//3. Enter Text in Search Box
		
		//3.1 Find Search BOX
		WebElement searchbox = driver.findElement(By.name("q"));
		
		//3.2 Enter Text in it
		searchbox.sendKeys("Selenium");
		
		//4. Hit the enter
		searchbox.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		//5. Verify that search results are displayed
		//String title = driver.getTitle();
		
		String actual = driver.getTitle();
		String expected = "Selenium - Google Search";
		
		//WebElement title = driver.findElement(By.tagName("title"));
		
		//if(title.equals("Selenium - Google Search")) {
		
		System.out.println("Title is: "+actual);
		  
		if(actual.equals(expected)) {			//if(actual.contains(expected)) {`
			System.out.println("Test passed");	// so you have to write in 37line String expected = "Selenium"
		}else {
			System.out.println("Test Failed");
			System.out.println("Title is: "+actual);
		}
	}
}
