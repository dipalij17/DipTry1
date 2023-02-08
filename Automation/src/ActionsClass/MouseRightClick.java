package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");		
		
		Thread.sleep(4000);
		
		WebElement btn = driver.findElement(By.xpath("(//*[text()='right click me'])[1]"));
		
		//create Actions class obj
		
		Actions act = new Actions(driver);
		
		act.contextClick(btn).build().perform();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@class='context-menu-item context-menu-icon context-menu-icon-paste']")).click();
		
		Thread.sleep(6000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(4000);
		
		driver.quit();
		

	}

}
