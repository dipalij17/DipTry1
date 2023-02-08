package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(100);
		
		//Take screenshot and copy into object
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//typecasting

		File Dest = new File("D:\\Manual\\redbus.jpg");
	
		FileHandler.copy(Source, Dest);
		
	}

}
