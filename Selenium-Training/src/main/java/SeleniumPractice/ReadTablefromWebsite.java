package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTablefromWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> TableColum = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		
		System.out.println(TableColum.size());
		
		for(int i=0; i<TableColum.size(); i++) {
			
			String contactame = TableColum.get(i).getText();
			
			System.out.println("Contact Name is " +contactame);
			
		}

	}

}
