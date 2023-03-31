package com.practice.test.practice;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class selfIntro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Chaitanya";
		System.setProperty("webdriver.chrome.driver", ".S\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("kkkkkkkkkkkk");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String pswd = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		//System.out.println(pswd);
		String[] arrOfpswd = pswd.split("'");
		pswd = arrOfpswd[1];
		//System.out.println(pswd);
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(pswd);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		driver.close();	
		driver.quit();
		
	}

}
