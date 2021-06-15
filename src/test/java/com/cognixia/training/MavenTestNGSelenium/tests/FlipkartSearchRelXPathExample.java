package com.cognixia.training.MavenTestNGSelenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class FlipkartSearchRelXPathExample extends Base {
public static void main(String[] args) throws InterruptedException {
		
		openBrowser("Chrome");
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Timeout after 30 seconds
		
		driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
		
		String searchstring = "iphone";
		
		driver.findElement(By.xpath("//form/div/div/input")).sendKeys(searchstring);
		
		//Submit the form
		//driver.findElement(By.name("q")).submit();
		
		//Click on the search icon
		driver.findElement(By.xpath("//form/div[1]/button[1]")).click();
		
		//Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//span[@class='_10Ermr']")).getText();
		
		int startingindex = text.indexOf("of");
		int endingindex = text.indexOf("results");
		
		String numberofitems = text.substring(startingindex+2, endingindex-1);
		
		System.out.println("No. of iphone in inventory are: "+numberofitems);
		
		//Access Parent object using xpath
		String info = driver.findElement(By.xpath("//div[@class='_4rR01T']/..")).getText();
		
		System.out.println(info);
	}

}
