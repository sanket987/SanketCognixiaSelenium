package com.cognixia.training.MavenTestNGSelenium.tests;
import java.io.*;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class AssignmentBrowser extends Base{
	
		

	static Scanner myFile;

	public static void main(String[] args) throws  InterruptedException {
		
		try {
			myFile = new Scanner(new File("resources/Text3"));
		}
		catch(Exception e) {
			System.out.println("File not found: plz check the file");
		}
		
		openBrowser("chrome");
		//openBrowser("firefox");
		driver.get("https://www.google.com");
		
		while(myFile.hasNext()) {
			String browser1 = myFile.nextLine();
			WebElement searchbox = driver.findElement(By.name("q"));
			searchbox.sendKeys(browser1);
			Thread.sleep(100);
			WebElement searchbox1 = driver.findElement(By.name("btnK"));
			searchbox1.click();
			Thread.sleep(500);
			String actual = driver.getTitle();
			
			String expected = browser1;
			
			System.out.println("Testing for "+expected+" is:-" );
			System.out.println("actual is :"+actual);
				
			
			if(actual.contains(expected)) {
				System.out.println("Test passed");
			}
			else {
				System.out.println("Test failed");
			}
			Thread.sleep(500);
			driver.navigate().back();
			}driver.close();
			
		}
				

	}

	
		
	


