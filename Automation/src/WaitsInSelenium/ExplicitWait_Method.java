package WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Method {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		By input1 = By.id("src");
		
		//explictWait(driver,input1,15);

		explictWait(driver,input1,20).sendKeys("Pune");
		
	}
	
	public static WebElement explictWait(WebDriver driver,By locator,int timeout)
	{
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
								
		mywait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		//mywait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return driver.findElement(locator);
		
	}
	
	

}
