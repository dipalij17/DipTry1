package alerthandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp6 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(2000);
		
		//driver.switchTo().alert().sendKeys("admin");//NoAlertPresentException
		
		   //   synatx  "https://username:password@the-internet.herokuapp.com/basic_auth"
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
