package alerthandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		Thread.sleep(2000);
		
		String ActualMsg = driver.switchTo().alert().getText();
		
		System.out.println("Alert msg is : "+ActualMsg);
		
		String ExpectedMsg = "Please enter your password";
		
		if(ActualMsg.equals(ExpectedMsg))
			System.out.println("TC Passed");
		else
			System.out.println("TC Failed");
		
		driver.quit();
		
		
	}

}
