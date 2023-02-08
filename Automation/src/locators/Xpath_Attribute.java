package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attribute {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\\\Installer\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//input[@name="email"]
		//input[@name="pass"]
		//button[@name="login"]
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("ABC");
		
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("abc@12");
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		

	}

}
