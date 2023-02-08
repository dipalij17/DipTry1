package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DataDrivenF {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();
		
		String acutaluser = driver.findElement(By.xpath("//*[@class=\"oxd-userdropdown-name\"]")).getText();
		
		String Expecteduser = "abc Paika";
		
		if(acutaluser.equals(Expecteduser))
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
