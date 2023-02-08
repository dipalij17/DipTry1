package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement ele = driver.findElement(By.xpath("//*[text()=\"Example\"]"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		//total No of rows in table 
		
		int rows = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr")).size();
		
		System.out.println("Total number of rows in table are: "+rows);
		
		//
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
		
		//total No of columns in table 
		
		int cols = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//th")).size();
		
		System.out.println("Total number of rows in table are: "+cols);
		
		List<WebElement> col1 = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//th"));
		
		//print specific data from web table
		String Data = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[2]//td[3]")).getText();
		
		System.out.println(Data);
		
		//Print all data from web table
		
		for(int i=2;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				String Data1 = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(Data1+"    |");
			}
			
			System.out.println();
		}

		
		
		
	}

}
