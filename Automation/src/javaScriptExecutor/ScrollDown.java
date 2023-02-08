package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");

		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//second argument can be ignored or removed
		//js.executeScript("window.scrollBy(0,5500)","");// also applicable
		
		js.executeScript("window.scrollBy(0,4500)");

		
		Thread.sleep(4000);
		
		js.executeScript("window.scrollBy(0,-3000)");
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
