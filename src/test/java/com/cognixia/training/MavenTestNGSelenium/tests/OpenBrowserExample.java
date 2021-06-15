package com.cognixia.training.MavenTestNGSelenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class OpenBrowserExample {

	public static void main(String[] args) {
		
		//Vehicle v = new Car();
		System.setProperty("webdriver.chrome.driver","C:\\Tools\\Selenium\\chromedriver.exe");//windows OS
		
		WebDriver driver = new ChromeDriver();  //Opens a blank browser
		
		driver.get("https://www.google.com");
		

	}

}
