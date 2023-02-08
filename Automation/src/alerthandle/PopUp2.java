package alerthandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[text()=\"Click for JS Alert\"]")).click();

		Thread.sleep(2000);
		
		String ActualMsg = driver.switchTo().alert().getText();
		
		System.out.println("Msg displayed on alert is : "+ActualMsg);
		
		String ExpectedMsg = "I am a JS Alert";
		
		if(ActualMsg.equals(ExpectedMsg))
			System.out.println("TC passed");
		else
			System.out.println("TC Failed");
		
		driver.quit();
		

	}

}
