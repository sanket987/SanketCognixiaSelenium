package com.cognixia.training.MavenTestNGSelenium.tests;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class FlipkartFarzi extends Base {

	public static void main(String[] args) throws InterruptedException {
		
		openBrowser("Chrome");
				
		driver.get("https://flipkart.com");
				
		driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
				
		String searchstring = "samsung";
				
		driver.findElement(By.name("q")).sendKeys(searchstring);
				
				
				//Implicit Wait is only worried about finding the element. (presence of the element)
				//Implicit Wait does NOT care about what is Inside the element, 
				//e.g. it does not care about what is the text in the element
				//Implicit wait also does not care about HOW MANY such elements are present
				//As soon as ONE element becomes present, Implicit wait will resolve and proceed
				
				//Explicit Wait
				//Waits for some property of the element
				//presence of element is just 1 property
				//some other properties are:
				//The text inside element
				//The number of elements
				//The @name attribute of element should have value
				//The color of the element		
		
		WebDriverWait waitforeightelements = new WebDriverWait(driver,5);
		waitforeightelements.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//form/ul//div[@class='lrtEPN _17d0yO']"), 8));
				
		List<WebElement> suggestions = driver.findElements(By.xpath("//form/ul//div[@class='lrtEPN _17d0yO']"));
				
		System.out.println(suggestions.size());
				
		for (WebElement suggestion : suggestions) {
			System.out.println(suggestion.getText());
		}		
	}
	
          
}
	
	
		

	


