package com.cognixia.training.MavenTestNGSelenium.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class GoogleExample extends Base{
	
	public static void main(String[] args) throws InterruptedException {
		searchGoogle("Selenium");
		//1. Try to print the first link only
		String Link = driver.findElement(By.tagName("h3")).getText();
		System.out.println(Link);
		
		//2. try to print for all links
		List<WebElement> all_links = driver.findElements(By.tagName("h3"));
		
		//all_links.forEach(1 ->{   --lambda function is the easiest 
		//if(!l.getText().equals(""){
		//System.out.println(l.getText()); //}
		
		
		//all.forEach(l -> System.out.println(l.getText())); --this is also
		for(WebElement List:all_links) {
			if(List.getText()=="") {
			}else {
				System.out.println(List.getText());
			}
		}
		driver.close();
	}
	

	private static void searchGoogle(String string) throws InterruptedException {
		
		//1. open the browser
		openBrowser("chrome");
		//openBrowser("firefox");
		
		//2. Navigate the url
		driver.get("https://www.google.com");
		
		//3.1 find search box
		WebElement searchbox = driver.findElement(By.name("q"));
		
		//3.2 Enter text in it
		searchbox.sendKeys("Selenium");  //the test "Selenium is called test data"
		
		//waiting for the button to stabilize. this is called as synchronization.
		//we are synchronizing our script with the performance of webpage
		Thread.sleep(500); //not recommended to be used in sripting
		
		//4. click searchbox	
		WebElement searchbutton = driver.findElement(By.name("btnK"));
		searchbutton.click();
		Thread.sleep(2000);
		
			
			
			
		}
		
	}


