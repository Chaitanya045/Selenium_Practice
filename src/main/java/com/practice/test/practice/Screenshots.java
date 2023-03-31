package com.practice.test.practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;



public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 


		 System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
		//	driver.manage().deleteCookieNamed("sessionKey");
		
		//click on any link
			//login page- verify login url
			
			
			driver.get("http://google.com");
			
			TakesScreenshot ss = (TakesScreenshot)driver;
			
			File src=	 ss.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\rahul\\screenshot.png"));
		
		
	}

}
