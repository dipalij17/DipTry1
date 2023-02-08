package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		WebElement input1=driver.findElement(By.id("email"));
		WebElement input2=driver.findElement(By.id("pass"));
		
		Thread.sleep(3000);
		input1.sendKeys("This is my first java program");

		Actions Act = new Actions(driver);

		Thread.sleep(2000);

		// Act.sendKeys(Keys.CONTROL);
		Act.keyDown(Keys.COMMAND);
		Act.sendKeys("a");
		// Act.keyUp(Keys.CONTROL);
		Act.keyUp(Keys.COMMAND);
		Act.build().perform();

		// Ctrl+c
		// Act.sendKeys(Keys.CONTROL);
		Act.keyDown(Keys.COMMAND);
		Act.sendKeys("c");
		// Act.keyUp(Keys.CONTROL);
		Act.keyUp(Keys.COMMAND);
		Act.build().perform();

		// Tab
		Act.sendKeys(Keys.TAB);
		Act.build().perform();

		Thread.sleep(2000);
		// Act.sendKeys(Keys.CONTROL);
		Act.keyDown(Keys.COMMAND);
		Act.sendKeys("v");
		// Act.keyUp(Keys.CONTROL);
		Act.keyUp(Keys.COMMAND);
		Act.build().perform();
		
		System.out.println(input1.getAttribute("value"));
		System.out.println(input2.getAttribute("value"));

		//compare text
		if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
			System.out.println("Correct text");
		}
		else {
			System.out.println("incorrect copied");
		}
	}

}
