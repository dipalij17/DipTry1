package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox5 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Installer\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("Pune");
		
		Thread.sleep(5000);
		
		List<WebElement> City=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
	
		System.out.println("Totla Count :"+City.size());
		Thread.sleep(5000);

		
		for(int i=0;i<City.size();i++) {
			
			//City.get(i).getText();
			System.out.println(City.get(i).getText());
			
		}
		
		//driver.quit();

	}

}
