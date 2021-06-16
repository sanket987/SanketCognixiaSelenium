package com.cognixia.training.MavenTestNGSelenium.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.cognixia.training.Maven.TestNG.Selenium.common.Base;
import com.cognixia.training.Maven.TestNG.Selenium.common.Base2;
import com.cognixia.training.Maven.TestNG.Selenium.common.ReadFromExcel;
import java.io.IOException;

public class GoogleExcelFromFile extends Base2{
	
	@Test(dataProvider = "getDataFromExcel")
		public void test(String SearchResults, String ExpectedResults) throws IOException

		{
			WebElement searchbox;
			openBrowser("Chrome");
			driver.navigate().to("https://google.com");
			searchbox = driver.findElement(By.name("q"));
			searchbox.sendKeys(SearchResults);
			
			WebElement searchgooglebutton = driver.findElement(By.className("gNO89b"));
			searchgooglebutton.click();
			String actual = driver.getTitle();
			if (actual.equals(ExpectedResults)) {
				System.out.println("Test Case Passed");
			} else {
				System.out.println("Test Case Failed");
			}
				
			
		}

		
		// Taking test data from file
		@DataProvider
		public Object[][] getDataFromExcel() throws IOException {
			return ReadFromExcel.readExcelData("Resources/DataSheet.xlsx");

		}

	}

