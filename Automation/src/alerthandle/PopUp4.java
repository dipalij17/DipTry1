package alerthandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("Test");
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
