package com.cognixia.training.MavenTestNGSelenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class AssignmentwithXPath extends Base {

	public static void main(String[] args) throws InterruptedException {
	
		    openBrowser("chrome");
				
			driver.get("http://destinationqa.com/aut-samplepersonalinformationform/");
				
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			driver.findElement(By.xpath("//input[@class='PItext fname']")).sendKeys("Sanket");
			Thread.sleep(2000);
				
			driver.findElement(By.xpath("//input[@class='PItext']")).sendKeys("Jain");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/p[8]/input[1]")).sendKeys("7987918405");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/input[1]")).click();
				
			driver.findElement(By.xpath("//tbody/tr[2]/td[2]/p[3]/input[1]")).click();
			Thread.sleep(2000);
				
			driver.findElement(By.xpath("//tbody/tr[2]/td[2]/p[4]/select[1]//option[contains(text(),'Blue')]")).click();
				
			driver.findElement(By.xpath("//tbody/tr[2]/td[3]/p[2]/input[1]")).sendKeys("sanket@987");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//tbody/tr[2]/td[3]/p[4]/input[1]")).sendKeys("987@sanket");
			
			
			driver.findElement(By.xpath("//tbody/tr[2]/td[3]/p[5]/input[1]")).click();
					
			}
			
}


