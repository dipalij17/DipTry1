package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUptoSpecificElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement MyLearning = driver.findElement(By.xpath("//*[text()='My Learning']")); 
		
		
		//Scroll up to specific element
		
		js.executeScript("arguments[0].scrollIntoView()", MyLearning);
		
		//js.executeScript("arguments[0].scrollIntoView();", MyLearning);

		
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
