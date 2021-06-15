package com.cognixia.training.Maven.TestNG.Selenium.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	protected static WebDriver driver; 
	
	static void setProperties() {
		System.setProperty("webdriver.chrome.driver","C:\\Tools\\Selenium\\chromedriver.exe");	//windows OS
		System.setProperty("webdriver.gecko.driver", "C:\\Tools\\Selenium\\geckodriver.exe");
	}
	
	protected static void openBrowser(String browser) {
		
		setProperties();
		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}



	
		
		
	


