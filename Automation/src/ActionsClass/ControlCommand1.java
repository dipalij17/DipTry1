package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ControlCommand1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);

//		WebElement input1 = driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]"));
//		WebElement input2 = driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]"));

		WebElement input1 =driver.findElement(By.xpath("//input[@name=\"username\"]"));
		WebElement input2 =driver.findElement(By.xpath("//input[@name=\"password\"]"));	
		
		input1.sendKeys("This is my first java program");

		Actions Act = new Actions(driver);

		Thread.sleep(5000);

		// Ctrl+A

		// Act.sendKeys(Keys.CONTROL);
		Act.keyDown(Keys.COMMAND);
		Act.sendKeys("A");
		// Act.keyUp(Keys.CONTROL);
		Act.keyUp(Keys.COMMAND);
		Act.build().perform();

		// Ctrl+c
		// Act.sendKeys(Keys.CONTROL);
		Act.keyDown(Keys.COMMAND);
		Act.sendKeys("C");
		// Act.keyUp(Keys.CONTROL);
		Act.keyUp(Keys.COMMAND);
		Act.build().perform();
		
		Thread.sleep(4000);

		// Tab
		Act.sendKeys(Keys.TAB);
		Act.build().perform();
        System.out.println("Hello");
        
        Thread.sleep(2000);
		// Act.sendKeys(Keys.CONTROL);
		Act.keyDown(Keys.COMMAND);
		Act.sendKeys("V");
		// Act.keyUp(Keys.CONTROL);
		Act.keyUp(Keys.COMMAND);
		Act.build().perform();
		
		System.out.println("nicee");
	}

}
