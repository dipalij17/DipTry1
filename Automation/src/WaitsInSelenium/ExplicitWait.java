package WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		WebElement ele = driver.findElement(By.xpath("(//*[contains(text(),\"Save upto Rs 250* on your bus tickets.\")])[1]"));
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		By ele2 = By.xpath("(//*[contains(text(),'Save upto Rs 250* on your bus tickets.')])[1]");
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(ele2));
		
		driver.findElement(By.id("src")).sendKeys("Pune");
	}

}
