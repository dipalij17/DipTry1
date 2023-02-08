package webdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Dimension d = new Dimension(500,400);
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(3000);
		
		System.out.println(driver.manage().window().getSize());
		
		driver.quit();

	}

}
