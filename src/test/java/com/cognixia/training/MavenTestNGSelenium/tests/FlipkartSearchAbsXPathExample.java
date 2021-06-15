package com.cognixia.training.MavenTestNGSelenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class FlipkartSearchAbsXPathExample extends Base {

	

		public static void main(String[] args) throws InterruptedException {
			
			openBrowser("Chrome");
			
			driver.get("https://www.flipkart.com");
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Timeout after 30 seconds
			
			driver.findElement(By.xpath("html/body/div/div/div/button")).click();
			
			String searchstring = "iphone";
			
			driver.findElement(By.xpath("html/body/div/div/div/div/div/div/form/div/div/input")).sendKeys(searchstring);
			
			//Submit the form
			//driver.findElement(By.name("q")).submit();
			
			//Click on the search icon
			driver.findElement(By.xpath("html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]")).click();
			
			//Thread.sleep(2000);
			
			String text = driver.findElement(By.xpath("html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]")).getText();
			
			int startingindex = text.indexOf("of");
			int endingindex = text.indexOf("results");
			
			String numberofitems = text.substring(startingindex+2, endingindex-1);
			
			System.out.println("No. of iphone in inventory are: "+numberofitems);
		}

	}

	
	


