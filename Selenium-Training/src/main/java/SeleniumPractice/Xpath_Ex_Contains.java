package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Ex_Contains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		//Contains is used only for linkText or the text of the content
		
		driver.findElement(By.xpath("//a[contains(text(), 'Contact')]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(), 'account')]")).click();
		
		//Start-with command
		
		driver.findElement(By.xpath("//input[starts-with(@id, 'search_query')]")).sendKeys("Blouse");
		
		
	}

}
