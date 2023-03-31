	package com.practice.test.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		WebElement ele_1 = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele_1).click().keyDown(Keys.SHIFT).sendKeys("cosmicbyte controller").keyDown(Keys.ENTER).build().perform();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("a[id='nav-link-accountList']")));
		act.moveToElement(ele).build().perform();
		Thread.sleep(5000);
		driver.quit();
	}

}
