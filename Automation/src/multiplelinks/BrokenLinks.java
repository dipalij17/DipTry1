package multiplelinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		int totalLinks = Links.size();
		
		System.out.println("Total no of links are: "+totalLinks);
		
		int brokenLinks =0;
		
		for(int i=0;i< totalLinks;i++)
		{
			String url = Links.get(i).getAttribute("a");
			
			if(url==null || url.isEmpty())
			{
				System.out.println("url is empty");
				continue;
			}
			
			URL li = new URL(url);
			
			HttpURLConnection httpcode = (HttpURLConnection) li.openConnection();
			
			httpcode.connect();
			
			if(httpcode.getResponseCode()>=400)
			{
				System.out.println(httpcode.getResponseCode()+"--->"+url+"is Broken Link");
				brokenLinks++;
			}
			else {
				System.out.println(httpcode.getResponseCode()+"--->"+url+"is valid link");
			}
								
		}
		
		System.out.println("Total no of broken links are: "+brokenLinks);
		
		driver.quit();
		
	}

}
