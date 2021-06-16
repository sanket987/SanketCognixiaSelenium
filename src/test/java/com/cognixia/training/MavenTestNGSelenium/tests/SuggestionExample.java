package com.cognixia.training.MavenTestNGSelenium.tests;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class SuggestionExample extends Base {

	public static void main(String[] args) throws InterruptedException {
		openBrowser("Chrome");
				
		driver.get("https://www.google.com");
		
		driver.get("https://www.Flipkart.com");
		
						
		driver.findElement(By.className("_2QfC02")).findElement(By.tagName("button")).click();
						
		String search = "samsung ";
						
		driver.findElement(By.name("q")).sendKeys(search);
						
		Thread.sleep(2000);
						
						
		WebElement firstsuggestion = driver.findElement(By.xpath("//div[@class='lrtEPN _17d0yO']"));
						
		WebDriverWait myWait = new WebDriverWait(driver, 10);
		myWait.until(ExpectedConditions.textToBePresentInElement(firstsuggestion, search));
						
						
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		for (WebElement h : list) {
							
			System.out.println(h.getText());
		}
						

	}
}



		
	

		
	
		


