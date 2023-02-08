package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightBorder_usingMethod {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
			
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement pass = driver.findElement(By.id("pass"));
		
		drwaBorder(email,driver);
		
		Thread.sleep(2000);
		
		addBackgroudColor(pass,driver);
		
		Thread.sleep(3000);

		driver.quit();
	}

	
	public static void drwaBorder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].style.border = '10px solid green' ", element);
	}
	
	public static void addBackgroudColor(WebElement elemnet2,WebDriver driver2)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver2;
		
		js.executeScript("arguments[0].style.background = 'yellow' ", elemnet2);
	}
}
