package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/frames");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame1");

		String Text = driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
		
		System.out.println(Text);
		
		driver.quit();
	}

}
