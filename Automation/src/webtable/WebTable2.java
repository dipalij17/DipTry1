package webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int row = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr")).size();
		
		int col = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//th")).size();
		
		String expectedData = "Italy";
		
		for(int i=2;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				
				
				String data = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td["+j+"]")).getText();
				
				if(data.equals(expectedData))
				{
					System.out.println("Expected data matched :"+data);
				}
				System.out.print(data+"    |");
			
			}
			
			System.out.println();
		}

				
				driver.quit();

	}

}
