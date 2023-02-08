package alerthandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp1 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()=\"Click for JS Alert\"]")).click();

		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(2000);
		
		String actualMsg = driver.findElement(By.xpath("//*[text()='You successfully clicked an alert']")).getText();
		
		Thread.sleep(2000);
		
		String expectedMsg = "You successfully clicked an alert";
		
		if(actualMsg.equals(expectedMsg))
			System.out.println("Test Case Passed");
		else
			System.out.println("Test Case Failed");
		
		
		driver.quit();
		
	}

}
