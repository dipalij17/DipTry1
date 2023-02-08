package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpTop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");

		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		//Scroll upto bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", args);
		
		
		Thread.sleep(4000);
		
		//Scroll upto Top
		//js.executeScript("document.documentElement.scrollTop=0",args);
		
		js.executeScript("document.documentElement.scrollTop=0");

		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
