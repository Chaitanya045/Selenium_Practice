package com.practice.test.practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String window_1 = it.next();
		String window_2 = it.next();
		driver.switchTo().window(window_2);
		WebElement redText = driver.findElement(By.cssSelector("p[class='im-para red']"));
		wait.until(ExpectedConditions.visibilityOf(redText));
		String email = redText.getText();
		String[] emailArr = email.split(" ");
		email = emailArr[4];
		driver.switchTo().window(window_1);
		driver.findElement(By.cssSelector("#username")).sendKeys(email);
		
		

	}

}
