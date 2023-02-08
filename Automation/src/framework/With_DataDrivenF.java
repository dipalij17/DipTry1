package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DataDrivenF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		String path = "D:\\Data\\DDF.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		String username=sh.getRow(1).getCell(0).getStringCellValue();
		
		String pass = sh.getRow(1).getCell(1).getStringCellValue();
		String expecteduser = sh.getRow(1).getCell(2).getStringCellValue();
		
		driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys(username);
		
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys(pass);

		driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();

		String acutaluser = driver.findElement(By.xpath("//*[@class=\"oxd-userdropdown-name\"]")).getText();
		
		System.out.println("acutaluser is : "+acutaluser);
		
		System.out.println("expecteduser is : "+expecteduser);
		
		if(acutaluser.equals(expecteduser))
		{
			System.out.println("Correct user");
		}
		else
		{
			System.out.println("Incorrect user");
		}
		
		driver.quit();
	}

}
