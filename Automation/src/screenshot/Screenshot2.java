package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(100);
		
		//Take screenshot and copy into object
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(5);
		
		String imgName = "RedBus2";
		
		File dest = new File("C:\\Users\\HP\\Desktop\\Study Material\\snapshots\\"+imgName+""+random+".jpg");
		
		FileHandler.copy(source, dest);
		
		driver.quit();
	}

}
