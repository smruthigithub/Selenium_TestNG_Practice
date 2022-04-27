package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		//Types of Xpaths
		
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Shirts");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
		
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("T-Shirts");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='search_query']")).clear();
		
		driver.findElement(By.xpath("//input[@class='search_query form-control ac_input']")).sendKeys("Jeans");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='search_query form-control ac_input']")).clear();
		
	}

}
