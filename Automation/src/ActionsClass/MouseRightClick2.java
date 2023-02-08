package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick2 {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");		
		
		Thread.sleep(4000);
		
		WebElement btn = driver.findElement(By.id("nav-hamburger-menu"));
		
		//create Actions class obj
		
		Actions act = new Actions(driver);
		
		act.contextClick(btn).build().perform();
		
		Thread.sleep(4000);
		
		driver.quit();
		

	}

}
