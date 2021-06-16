package com.cognixia.training.MavenTestNGSelenium;

import java.io.File;

import java.io.IOException;
import com.cognixia.training.Maven.TestNG.Selenium.common.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ClearTripScreenshot extends Base {

	public static void main(String[] args) throws IOException {
		
		openBrowser("Chrome");
		
		driver.get("https://www.cleartrip.com");
		
		File f;
		
		f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("C:/Tools/cleartrip.jpg"));
	}

}
