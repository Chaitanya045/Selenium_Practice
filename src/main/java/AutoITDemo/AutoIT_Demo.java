package AutoITDemo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoIT_Demo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		driver.get("https://easyupload.io/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='dz-button']")));
		driver.findElement(By.xpath("//button[@class='dz-button']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Eclipse\\fileupload.exe");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("upload")));
		driver.findElement(By.id("upload")).click();
	}

}
