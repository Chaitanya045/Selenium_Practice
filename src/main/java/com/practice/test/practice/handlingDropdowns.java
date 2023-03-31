package com.practice.test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Static dropdowns because options in the dropdown are fixed (tagname is select dropdowns)
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		WebElement anotherDropdown = driver.findElement(By.id("divpaxinfo"));
		anotherDropdown.click();
		Thread.sleep(2000);
		WebElement increase = driver.findElement(By.id("hrefIncAdt"));
		for(int i=0;i<=3;i++) {
			increase.click();
		}
		Thread.sleep(2000);
		System.out.println(anotherDropdown.getText());
		
		
		
		
		
		
		
		
		
		driver.close();
		driver.quit();
	}

}
