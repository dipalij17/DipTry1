package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste_SendKeys {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		WebElement input1 = driver.findElement(By.id("email"));
		
		WebElement input2 = driver.findElement(By.id("pass"));
		
		input1.sendKeys("Hello Dipali!!!");
		
		Actions act = new Actions(driver);
		
		
		//Control +a
		//act.sendKeys(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.COMMAND).build().perform();
		act.sendKeys("a");
		
		//Release key
		act.keyUp(Keys.CONTROL).build().perform();
		
		//Control +c
		//act.sendKeys(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.COMMAND).build().perform();
		act.sendKeys("c");
		
		//Release
		act.keyUp(Keys.CONTROL).build().perform();
		
		//Enter tab 
		
		act.sendKeys(Keys.TAB).build().perform();
		
		//Control +v
		act.sendKeys(Keys.CONTROL).build().perform();
		act.sendKeys("v");
		
		//Release
		act.keyUp(Keys.CONTROL).build().perform();
		
		
		
		

		
	}

}
