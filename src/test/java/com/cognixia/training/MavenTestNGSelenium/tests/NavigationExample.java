package com.cognixia.training.MavenTestNGSelenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Tools/Selenium/chromedriver.exe");
		
		//WebDriver Interface is a w3c standard. All browsers who want W3C certification have to 
		//mandatorily implement the WebDriver .
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.get("https://www.flipkart.com");
		driver.navigate().to("https://www.bigbasket.com"); //does the same thing that get() command does 
															//but improves readablilty
		driver.navigate().back(); //go back to flipkart
		driver.navigate().back(); //go back amazon
		driver.navigate().forward(); //go to forward
		driver.navigate().refresh(); 
		driver.close(); // closes the browser window on the screen, but the driver object is active in memory
		
		driver.quit();   //remove the driver object from memory
	}
	

}