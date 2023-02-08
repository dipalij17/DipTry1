package windowhandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleS2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Thread.sleep(3000);
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		System.out.println(windowIDs);
		
		//Print using arraylist
		
		ArrayList<String> windowList = new ArrayList(windowIDs);
		
		String windowID_1 = windowList.get(0);
		
		String windowID_2 = windowList.get(1);
		
		System.out.println("Window ID of 1st: "+windowID_1);
		
		System.out.println("Window ID of 2nd: "+windowID_2);
		
		driver.switchTo().window(windowID_1);
		
		
	}

}
