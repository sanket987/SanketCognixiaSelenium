package com.cognixia.training.MavenTestNGSelenium.tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class RediffRegisteration extends Base{

	public static void main(String[] args) {
		
		openBrowser("chrome");
						
		driver.get("https://register.rediff.com/register/register.php");
						
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
		driver.findElement(By.xpath("//input[@type='text' and starts-with(@name,'name')]")).sendKeys("Sanket");
	 
	//Password Field
		driver.findElement(By.xpath("//*[starts-with(@name,'passwd')]")).sendKeys("sanketjain");
	 
	 
		WebElement day_select = driver.findElement(By.xpath("//*[starts-with(@name, 'DOB_Day')]"));
		Select day = new Select(day_select);
		day.selectByVisibleText("09");
     
		Select month =new Select(driver.findElement(By.xpath("//*[starts-with(@name, 'DOB_Month')]")));
		month.selectByIndex(3);
	 
		Select year =new Select(driver.findElement(By.xpath("//*[starts-with(@name, 'DOB_Year')]")));
		year.selectByValue("1997");
     
		Select country =new Select(driver.findElement(By.xpath("//*[starts-with(@name, 'country')]")));
		country.selectByVisibleText("India");
     
		Select city =new Select(driver.findElement(By.xpath("//*[starts-with(@name, 'city')]")));
		city.selectByVisibleText("Bhopal");
     
		driver.findElement(By.xpath("//*[starts-with(@name, 'gender') and @value='m']")).click();
     
		WebElement altemail = driver.findElement(By.xpath("//*[starts-with(@name, 'altemail')]"));
		
		//CheckBox
		WebElement checkbox = driver.findElement(By.xpath("//*[starts-with(@name, 'chk_altemail')]"));
		if(!checkbox.isSelected()) {
			checkbox.click();
		} else {
			System.out.println("Checkbox already selected");
		}
		
		//Verify that the altemail field disappears
		if(!altemail.isDisplayed()) {
			System.out.println("Alt Email Disappeared");
		}
		
		//Click on Button
		driver.findElement(By.id("Register")).click();
		
		String expected = "ID cannot be blank";
		
		//Javascript popups - There is no HTML code
		
		Alert myalert = driver.switchTo().alert();
		
		String actual = myalert.getText(); //Get the text from the Alert
		
		System.out.println("Text on Alert box is: \n"+actual);
		
		if(actual.contains(expected)) {
			System.out.println("Test Passed");
			myalert.accept(); //OK button
			//myalert.dismiss(); //Cancel
			//myalert.sendKeys("Some text"); //If alert has a text box
		} else {
			System.out.println("Test Failed");
     }
		
	}
}

     
	
     
   
	 
					
	 
							
	
					

	


