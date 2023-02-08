package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Installer\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.findElement(
				By.xpath("//a[@role=\"button\" and @class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Ketan");

		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Patil");

		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("123456789");

		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("@#$%");
		// Step 1.
		WebElement Day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement Month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\"]"));

		// Q-1 How will u get the total no size

		Select selct1 = new Select(Day);
		
		List<WebElement>Listday = selct1.getOptions();
		
		System.out.println("Totlal Day :"+Listday.size());
		
		
		//Q2- How will u print all the values
		
		for(int i=0; i<Listday.size();i++) {
			
			String DayValues = Listday.get(i).getText();
			
			//System.out.println(DayValues);
			
		//3.How will u select specific values from drop down
			if(DayValues.equals("14")) {
				
				Listday.get(i).click();
			}
		}
		
		
		//2. Select month 
		Select selct2 = new Select(Month);
		
		List<WebElement> MonthValue =selct2.getOptions();
		System.out.println("Total Month :"+MonthValue.size());
		
		System.out.println();
		
		for(int i=0;i<MonthValue.size();i++) {
			
			String Months=MonthValue.get(i).getText();
			System.out.println(Months);
			
			if(Months.equals("May")) {
				MonthValue.get(i).click();
			}
		}
		
		//select year
		
		Select select3 =  new Select(Year);
		
		
		List<WebElement> yrvalues = select3.getOptions();
		System.out.println("total years : "+yrvalues.size());
		System.out.println();
		
for(int i=0;i<yrvalues.size();i++) {
			
			String Years=yrvalues.get(i).getText();
			System.out.println(Years);
			
			if(Years.equals("1998")) {
				yrvalues.get(i).click();
			}
		}
		
		
		Thread.sleep(3000);
		//driver.quit();

	}

}
