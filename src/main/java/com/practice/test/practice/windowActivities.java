package com.practice.test.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");//It will wait for the complete web page to load 100%
		driver.navigate().to("https://www.udemy.com/join/login-popup/?next=/home/my-courses/learning/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.close();
		//https://rahulshettyacademy.com/dropdownsPractise/
	}

}
