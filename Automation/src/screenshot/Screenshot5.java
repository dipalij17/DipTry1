package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot5 {

	
		public static void main(String[] args) throws InterruptedException, IOException {
			//C:\Users\HP\eclipse-workspace\Automation\Screenshots
			
			System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");

			Thread.sleep(4000);
			
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String random = RandomString.make(4);
			
			String imgname = "facebook";
			
			File dest = new File("C:\\Users\\HP\\eclipse-workspace\\Automation\\Screenshots\\"+imgname+""+random+".jpg");

			FileHandler.copy(source, dest);
			
			Thread.sleep(4000);
			
			driver.quit();

	}

}
