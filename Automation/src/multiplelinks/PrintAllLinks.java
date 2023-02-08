package multiplelinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//store all elements having tagname a
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//total no of links
		int totalLinks = links.size();
		
		System.out.println(totalLinks);

	        
	       System.out.println("Number of links present :"+totalLinks);
	              
	       //Print all the links
	       
	       for(int i=0;i<links.size();i++)
	       {
	    	   System.out.println(links.get(i).getText());
	    	   System.out.println(links.get(i).getAttribute("href"));
	       }
	       
//	       for(WebElement li : links)
//	       {
//	    	   
//	    	   System.out.println(li.getText());
//	    	   System.out.println(li.getAttribute("href"));
//	       }
		
		driver.quit();

	}

}
