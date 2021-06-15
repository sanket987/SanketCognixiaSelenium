package com.cognixia.training.MavenTestNGSelenium.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class MoneyRediffExample extends Base {

	

	public static void main(String[] args) {
		
		openBrowser("chrome");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/gainers");
		
		//1. Get the company name from the table
		List<WebElement> companynames = driver.findElements(By.xpath("//table[@class='dataTable']//a"));
		
		//1.1 get the table in list
		
		//1.2 Get company 
	//	for(int i =0;i<=10;i++) {
	//	System.out.println(companynames.get(i).getText());
	//	}
		
		System.out.println(companynames.size());
		
		
		//2. Get the current price
		
		List<WebElement> prices = driver.findElements(By.xpath("//table[@class='dataTable']//td[4]"));
		
//		String firstprice = prices.get(0).getText();
		
//		double myprice = Double.parseDouble(firstprice);
		
//		if(myprice>100.00) {
//			System.out.println("price is:"+myprice);
//		}else {
//			System.out.println("Price is less than 100.00 hence not printing");
//		}
		
		
		//3. Compare if the current price is>100 and print company name and price if greater the 100
		
		for (WebElement price : prices)
		{
			String eachprice = price.getText();
			eachprice = eachprice.replace(",","");  //replace all , to blank
			double pricedouble = Double.parseDouble(eachprice);
			
			if(pricedouble>100.00) {
				
			//Get the index of the price which is greater than 100
				int index = prices.indexOf(price);
				
			//Use the index to find the company name
				//WebElement companywithpricegreatertha100 = companynames.get(100);
				//String companyname = companywithpricegreatertha100.getText();
				
				//System.out.print(companyname);
				System.out.println(companynames.get(index).getText());
				System.out.println();
			
				}
			
		}
	}
}
	
		
	
		
		
		
			
	
	
	
			
		

	

