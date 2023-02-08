package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptClickAction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.id("w3loginbtn"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//click using javascriptexecutor
		 js.executeScript("arguments[0].click()", login);
		 
		 Thread.sleep(6000);
		 
		 driver.quit();
		
	}

}
