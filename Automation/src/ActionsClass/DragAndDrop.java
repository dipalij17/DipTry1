package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(4000);
		
		WebElement ele_drag = driver.findElement(By.xpath("(//*[text()='Washington'])[2]"));
		
		WebElement ele_drop = driver.findElement(By.xpath("//*[text()='United States']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(ele_drag, ele_drop).build().perform();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
