package assignments;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement linkedin = driver.findElement(By.xpath("(//*[@class='oxd-icon orangehrm-sm-icon'])[1]"));
		
		WebElement facebook = driver.findElement(By.xpath("(//*[@class='oxd-icon orangehrm-sm-icon'])[2]"));

		WebElement twitter = driver.findElement(By.xpath("(//*[@class='oxd-icon orangehrm-sm-icon'])[3]"));

		WebElement youtube = driver.findElement(By.xpath("(//*[@class='oxd-icon orangehrm-sm-icon'])[4]"));

		linkedin.click();        
		Thread.sleep(2000);
		facebook.click();
		Thread.sleep(2000);
		twitter.click();
		Thread.sleep(2000);
		youtube.click();
		Thread.sleep(6000);
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		ArrayList<String> windowList = new ArrayList(windowIDs);
		
		String Home_ID = windowList.get(0);

		
		String Linkedin_ID = windowList.get(1);
		
		String facebook_ID = windowList.get(2);
		
		String twitter_ID = windowList.get(3);

		String youtube_ID = windowList.get(4);
		
		Thread.sleep(10000);


		driver.switchTo().window(Linkedin_ID);
		String title_linkedin = driver.getTitle();
		System.out.println("Title of current page is: "+title_linkedin);
		Thread.sleep(8000);
		
		driver.switchTo().window(youtube_ID);
		String title_youtube = driver.getTitle();
		System.out.println("Title of current page is: "+title_youtube);
		Thread.sleep(8000);

		driver.switchTo().window(facebook_ID);
		String title_facebook = driver.getTitle();
		System.out.println("Title of current page is: "+title_facebook);
		Thread.sleep(8000);

		driver.switchTo().window(twitter_ID);
		String title_twitter = driver.getTitle();
		System.out.println("Title of current page is: "+title_twitter);
		Thread.sleep(8000);

		 driver.switchTo().window(Home_ID);
		 String title_home = driver.getTitle();
			System.out.println("Title of current page is: "+title_home);
			Thread.sleep(8000);
		
		String youtube_expected = 	"OrangeHRM Inc - YouTube";
		String facebook_expected = 	"OrangeHRM - World's Most Popular Opensource HRIS | Secaucus NJ | Facebook";
		String Twitter_expected = 	"OrangeHRM (@orangehrm) / Twitter";
		String LinkedIn_expected = 	"OrangeHRM | LinkedIn";
		String home_expected = 	"OrangeHRM";
		
		if(youtube_expected.equals(title_youtube))
		{
			System.out.println("You are on you tube page");
		}
		else if(facebook_expected.equals(title_facebook))
		{
			System.out.println("You are on facebook page");
		}
		else if(Twitter_expected.equals(title_twitter))
		{
			System.out.println("You are on twitter page");
		}
		else if(LinkedIn_expected.equals(title_linkedin))
		{
			System.out.println("You are on linkedin page");
		}
		else if(home_expected.equals(title_home))
		{
			System.out.println("You are on home page");
		}
		else
		{
			System.out.println("Failed---- Tile is not correct as expected.");
		}
	}

}
