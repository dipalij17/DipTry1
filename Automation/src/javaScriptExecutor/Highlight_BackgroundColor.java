package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Highlight_BackgroundColor {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
			
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
				
		js.executeScript("arguments[0].style.backgroundColor = 'yellow' ", element);

		
		Thread.sleep(5000);

		driver.quit();
	}

}
