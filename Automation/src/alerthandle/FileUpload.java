package alerthandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		Thread.sleep(6000);
		
		WebElement chooseFile = driver.findElement(By.id("file-upload"));
		
		//chooseFile.click();
		
		chooseFile.sendKeys("C:\\Users\\HP\\Desktop\\Study Material\\File Upload\\Test.docx");
		
		Thread.sleep(6000);
		
		driver.findElement(By.id("file-submit")).click();
	
		Thread.sleep(3000);
		
		driver.quit();
	
	}

}
