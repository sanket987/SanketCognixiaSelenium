package com.cognixia.training.MavenTestNGSelenium.tests;

import java.io.File;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class AssignmentTeamB extends Base {

	public static void main(String[] args) throws IOException {
		openBrowser("Chrome");
		driver.get("https://www.flipkart.com");

		//click on the cross button of the popup to dismiss it
		WebElement pop = driver.findElement(By.xpath("//div[@class = '_2QfC02']/button[contains(text(),x)]"));
        pop.click();
		
	
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //timeout after 30 seconds
		
		
		//click on the cross button of the popup to dismiss it
		
		String searchstring = "fitbit";
		driver.findElement(By.name("q")).sendKeys(searchstring);
		
		driver.findElement(By.className("L0Z3Pu")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	     
	       WebElement ele = driver.findElement(By.className("_10Ermr"));
	       
	       //Checking if results are more than  900
	     
	       String  str = ele.getText().trim();
	     
	       System.out.println(str);
	       String arr[] = str.split(" ");
	       String testData = arr[5];
	      
	       if(Integer.parseInt(testData)>900)
	       {
	    	  
	    	   System.out.println("Test Passed");
	       }
	       else
	       { System.out.println();
	    	   System.out.println("Test Failed");
	       }
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       WebElement link  =  driver.findElement(By.xpath("//a[@class='s1Q9rs' and contains(@title, 'Versa Special Edition')]"));
	       link.click();
	       
	     
	     // Taking ScreenShot
	       //File f;
	       
	       //	f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       
	     //   FileUtils.copyFile(f, new File("C:\\Users\\lenovo\\Desktop\\Projects\\SeleniumTraining\\Screenshots\\fitbit.jpg"));
	        
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
	        // 7. Finding original price
			
			WebElement originalprice = driver.findElement(By.xpath("//div[@class = '_25b18c']/div[2]"));
			String original = originalprice.getText();
			original = original.substring(1).replace(",", "");
			System.out.println("Original Price : " + original);
			
	      // 8. Finding Discounted price
			
			WebElement availableprice = driver.findElement(By.xpath("//div[@class='_25b18c']/div"));
			String price = availableprice.getText();
			price = price.substring(1).replace(",", "");
			System.out.println("Available Price : " + price);

	      // 9. Finding Discount percent
			
			WebElement discountper = driver.findElement(By.xpath("//div[@class = '_25b18c']/div[3]"));
			String discount = discountper.getText();
			System.out.println("Discount : " + discount);
			
		 // 10. Comparing discounted price with calculated price
			
			double discountpercent = Double.parseDouble(discount.substring(0, 2));
			double beforediscount = Double.parseDouble(original);
			double afterdiscount = Double.parseDouble(price);
			double discountamount = (discountpercent / 100) * (beforediscount);

			System.out.println("\nbefore : " + beforediscount + "\nafter : " + afterdiscount + "\ndiscount : "
					+ discountpercent + "\ndiscountamount : " + discountamount);
			
			double discountedprice = beforediscount - discountamount;
			System.out.println("Discounted price :" + discountedprice);

			if (discountedprice == Double.parseDouble(price)) {
				System.out.println("\nDiscount % is correct\n");
			} else {
				System.out.println("\nDiscount % is  NOT correct\n");
			}

			  
		    Set<String> handles = driver.getWindowHandles();
			int count = 0;
			for(String handle : handles)
			{
				
				count ++;
			     if(count == 2)
			     {
					driver.switchTo().window(handle);
					
					break;
			   }
			     
			}	
		
			
		// 11. Clicking on Add To Cart
			
			driver.findElement(By.xpath("//div[@class='_1p3MFP dTTu2M']/ul/li/button")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String handle2 = driver.getWindowHandle();
			driver.switchTo().window(handle2);
			
	   
	   // 12. Comparing final price with calculateed amount
			
		    String finalprice = driver.findElement(By.xpath("//div[@class ='Ob17DV _3X7Jj1']/span")).getText();
		    finalprice = finalprice.substring(1).replace(",", "");
		    Double doublefinal = Double.parseDouble(finalprice);
		    System.out.println("finl = " + doublefinal);
		    if(doublefinal  == discountedprice)
		    {
		    	System.out.println("/nFinal amount is discounted correctly -  Test Passed");
		    }
		    else
		    {
		    	System.out.println("Final amount is NOT  discounted correctly -  Test Failed");
		    }
		    
		    driver.close();
		    driver.quit();
		    
	   
		}		
		
}
		

	

