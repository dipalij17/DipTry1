package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot6 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
//		Screenshot6.captureSS("facebook");		
//		captureSS("Java");
//		captureSS("Selenium");
//		captureSS("Automation");
		
		captureSS("test");
		
		Thread.sleep(1000);
		
		driver.quit();

	}
	
	public static void captureSS(String imgname) throws IOException {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(2);
		
		File dest = new File("C:\\Users\\HP\\eclipse-workspace\\Automation\\Screenshots\\"+imgname+""+random+".jpg");
		
		//File dest = new File("./Automation/Screenshots/"+imgname+""+random+".jpg");
		
		
		FileHandler.copy(source, dest);
		
		
	}
	

}
