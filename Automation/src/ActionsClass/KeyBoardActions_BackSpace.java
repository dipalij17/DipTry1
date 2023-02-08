package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions_BackSpace {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Thread.sleep(4000);
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.BACK_SPACE).build().perform();
		
		Thread.sleep(2000);
		
		String test = driver.findElement(By.xpath("(//*[contains(text(),'You entered:')])[2]")).getText();
		
		System.out.println("Key pressed is: "+test);
		
		driver.quit();
		
	}

}
