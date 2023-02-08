package webdriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\\\Installer\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Point p = new Point(50,25);
		
		driver.manage().window().setPosition(p);
		
		System.out.println(driver.manage().window().getPosition());
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
