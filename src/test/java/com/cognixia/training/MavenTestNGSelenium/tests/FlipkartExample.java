package com.cognixia.training.MavenTestNGSelenium.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

import org.openqa.selenium.By;
public class FlipkartExample extends Base {

	public static void main(String[] args)  throws InterruptedException {
		openBrowser("Chrome");
		
		driver.get("https://www.flipkart.com");
		WebElement searchbox = driver.findElement(By.name("q"));
		
		String tofind = "samsung";
		WebElement parent = driver.findElement(By.className("_2QfC02"));
		WebElement child = parent.findElement(By.tagName("button"));
		child.click();
		
		WebElement results = driver.findElement(By.className("_3704LK"));
		results.sendKeys(tofind);
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement lastelement = driver.findElement(By.xpath("//div[@class = 'lrtEPN _17d0yO'])[last()]"));
		
			//Explicit wait
			WebDriverWait myWait = new WebDriverWait(driver, 10);
			myWait.until(ExpectedConditions.textToBePresentInElement(lastelement, tofind));
			
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class = 'lrtEPN _17d0yO']"));
		
			for(WebElement el:elements) {
			System.out.println(el.getText());
		}
	}

}

//)[last()]"
