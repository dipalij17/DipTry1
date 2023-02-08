package alerthandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp3 {

	public static void main(String[] args) throws InterruptedException {


System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		String ExpectedMsg = "You clicked: Cancel";
		
		String ActualMsg = driver.findElement(By.xpath("//*[text()='You clicked: Cancel']")).getText();
		
		if(ExpectedMsg.equals(ActualMsg))
			System.out.println("TC Passed");
		else
			System.out.println("TC Failed");
		
		
		
		driver.quit();
		
		
	}

}
