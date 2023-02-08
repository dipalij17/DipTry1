package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrent_URL {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\\\Installer\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(4000);
		
		String url = driver.getCurrentUrl();
		
		System.out.println("Current URL is : "+url);
		
		Thread.sleep(4000);
		
		driver.close();

	}

}
