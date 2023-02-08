package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\\\Installer\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");

		Thread.sleep(3000);
		
		
		//Skills DropDown
		
//		List<WebElement> skills = driver.findElements(By.xpath("//select[@id=\"Skills\"]//option"));
//				
//		Thread.sleep(3000);
//		
//		System.out.println("Total no of skills are: "+skills.size());
//		
//		//Print all values from Skills dropdown
//		for(int i=0;i<skills.size();i++)
//		{
//			System.out.println(skills.get(i).getText());
//		}
//		
//		Thread.sleep(1000);
//		
//		//select "APIs" value from skills dropdown
//		for(int i=0;i<skills.size();i++)
//		{
//			if(skills.get(i).getText().equals("APIs"))
//			{
//				skills.get(i).click();
//				break;
//			}
//		}
		
		//select Date 
		
		//print all values of year 
		
		List<WebElement> Year = driver.findElements(By.xpath("//select[@id=\"yearbox\"]//option"));
		
		System.out.println("Total Year values are: ");
		
		for(int i =0;i<Year.size();i++)
		{
			System.out.println(Year.get(i).getText());
		}
		
		//print all values of Month 
		
		List<WebElement> Month = driver.findElements(By.xpath("//select[@placeholder=\"Month\"]//option"));
			
		System.out.println("Total Months values are: ");
				
		for(int i =0;i<Month.size();i++)
		{
			System.out.println(Month.get(i).getText());
		}
				
		//print all values of Day 
				
		List<WebElement> Day = driver.findElements(By.xpath("//select[@id=\"daybox\"]//option"));
				
		System.out.println("Total Days values are: ");
				
		for(int i =0;i<Day.size();i++)
		{
			System.out.println(Day.get(i).getText());
		}
		
		//select date 
		
		String FullDate = "8/06/1923";
		
		String [] date =  FullDate.split("/");
		
		
		
		
		
		
	}

}
