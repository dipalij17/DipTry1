package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSendkeys {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement login = driver.findElement(By.id("w3loginbtn")); 
		
		js.executeScript("arguments[0].click()", login);
		 		
		Thread.sleep(8000);
		
		WebElement email = driver.findElement(By.name("email"));
		
		WebElement pass = driver.findElement(By.name("current-password"));

		js.executeScript("arguments[0].value='Dipali';", email);
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].value='JDFDFJ@%%';",pass);
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
