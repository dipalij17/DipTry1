package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_Method {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Installer\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String givenTitle = "Amazon.com. Spend less. Smile more.";
		
		if(title.equals(givenTitle))
		{
			System.out.println("Correct Title");
		}
		else
		{
			System.out.println("Incorrect Title");
		}
		
		driver.close();

	}

}
