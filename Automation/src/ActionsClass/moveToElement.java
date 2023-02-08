package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");		
		
		Thread.sleep(4000);
		
		WebElement ele = driver.findElement(By.id("nav-link-amazonprime"));
		
		//Create Actions class object 
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).build().perform();
		
		//act.moveToElement(ele).perform();
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
	}

}
