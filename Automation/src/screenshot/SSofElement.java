package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SSofElement {

	public static void main(String[] args) throws InterruptedException, IOException {

System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		Thread.sleep(4000);
		
		WebElement screen = driver.findElement(By.xpath("//*[@alt='Facebook']"));
		
		File source = ((TakesScreenshot)screen).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(4);
		
		String imgname = "facebook";
		
		File dest = new File("C:\\Users\\HP\\Desktop\\Study Material\\snapshots\\"+imgname+random);
		
		//FileHandler.copy(source, dest);
		
		FileUtils.copyFile(source, dest);
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
